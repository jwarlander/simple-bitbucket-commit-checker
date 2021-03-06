package se.bjurr.sbcc;

import static com.atlassian.bitbucket.repository.RefChangeType.DELETE;
import static java.util.regex.Pattern.compile;
import static se.bjurr.sbcc.SbccCommon.getBitbucketEmail;
import static se.bjurr.sbcc.SbccCommon.getBitbucketName;

import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.logging.Logger;

import se.bjurr.sbcc.data.SbccChangeSet;
import se.bjurr.sbcc.data.SbccRefChangeVerificationResult;
import se.bjurr.sbcc.data.SbccVerificationResult;
import se.bjurr.sbcc.settings.SbccSettings;

import com.atlassian.applinks.api.ApplicationLinkService;
import com.atlassian.applinks.api.CredentialsRequiredException;
import com.atlassian.bitbucket.auth.AuthenticationContext;
import com.atlassian.bitbucket.pull.PullRequest;
import com.atlassian.bitbucket.repository.RefChange;
import com.atlassian.bitbucket.repository.RefChangeType;
import com.atlassian.bitbucket.repository.Repository;
import com.atlassian.sal.api.net.ResponseException;

public class RefChangeValidator {
 private static Logger logger = Logger.getLogger(RefChangeValidator.class.getName());

 private final SbccSettings settings;
 private final ChangeSetsService changesetsService;
 private final AuthenticationContext bitbucketAuthenticationContext;
 private final CommitMessageValidator commitMessageValidator;
 private final CommitContentValidator commitContentValidator;

 private final SbccRenderer sbccRenderer;

 private final JqlValidator jqlValidator;

 private final Repository fromRepository;

 public RefChangeValidator(Repository fromRepository, Repository toRepository, SbccSettings settings,
   ChangeSetsService changesetsService, AuthenticationContext bitbucketAuthenticationContext, SbccRenderer sbccRenderer,
   ApplicationLinkService applicationLinkService, SbccUserAdminService sbccUserAdminService) {
  this.fromRepository = fromRepository;
  this.settings = settings;
  this.changesetsService = changesetsService;
  this.bitbucketAuthenticationContext = bitbucketAuthenticationContext;
  this.commitMessageValidator = new CommitMessageValidator(bitbucketAuthenticationContext, sbccUserAdminService);
  this.commitContentValidator = new CommitContentValidator(settings);
  this.sbccRenderer = sbccRenderer;
  this.jqlValidator = new JqlValidator(applicationLinkService, settings, sbccRenderer);
 }

 public SbccVerificationResult validateRefChanges(Collection<RefChange> refChanges)
   throws IOException, CredentialsRequiredException, ResponseException, ExecutionException {
  final SbccVerificationResult refChangeVerificationResult = new SbccVerificationResult();
  for (final RefChange refChange : refChanges) {
   validateRefChange(refChangeVerificationResult, refChange.getType(), refChange.getRef().getId(),
     refChange.getFromHash(), refChange.getToHash());
  }
  return refChangeVerificationResult;
 }

 public void validateRefChange(final SbccVerificationResult refChangeVerificationResult, RefChangeType refChangeType,
   String refId, String fromHash, String toHash)
   throws IOException, CredentialsRequiredException, ResponseException, ExecutionException {
  logger.fine(getBitbucketName(bitbucketAuthenticationContext) + " " + getBitbucketEmail(bitbucketAuthenticationContext)
    + "> RefChange " + fromHash + " " + refId + " " + toHash + " " + refChangeType);
  if (compile(settings.getBranches().or(".*")).matcher(refId).find()) {
   if (refChangeType != DELETE) {
    List<SbccChangeSet> refChangeSets = changesetsService.getNewChangeSets(settings, fromRepository, refId,
      refChangeType, fromHash, toHash);
    validateRefChange(refChangeVerificationResult, refId, fromHash, toHash, refChangeSets);
   }
  }
 }

 public void validateRefChange(SbccVerificationResult refChangeVerificationResults, PullRequest pullRequest)
   throws IOException, CredentialsRequiredException, ResponseException, ExecutionException {
  String refId = pullRequest.getFromRef().getId();
  String fromHash = pullRequest.getFromRef().getLatestCommit();
  String toHash = pullRequest.getToRef().getLatestCommit();
  List<SbccChangeSet> refChangeSets = changesetsService.getNewChangeSets(settings, pullRequest);
  validateRefChange(refChangeVerificationResults, refId, fromHash, toHash, refChangeSets);
 }

 private void validateRefChange(final SbccVerificationResult refChangeVerificationResult, String refId, String fromHash,
   String toHash, List<SbccChangeSet> refChangeSets)
   throws IOException, CredentialsRequiredException, ResponseException, ExecutionException {
  SbccRefChangeVerificationResult refChangeVerificationResults = validateRefChange(refChangeSets, settings, refId,
    fromHash, toHash);
  if (refChangeVerificationResults.hasReportables()) {
   refChangeVerificationResult.add(refChangeVerificationResults);
  }
 }

 private SbccRefChangeVerificationResult validateRefChange(List<SbccChangeSet> sbccChangeSets, SbccSettings settings,
   String refId, String fromHash, String toHash)
   throws IOException, CredentialsRequiredException, ResponseException, ExecutionException {
  final SbccRefChangeVerificationResult refChangeVerificationResult = new SbccRefChangeVerificationResult(refId,
    fromHash, toHash);
  refChangeVerificationResult.setBranchValidationResult(validateBranchName(refId));
  for (final SbccChangeSet sbccChangeSet : sbccChangeSets) {
   sbccRenderer.setSbccChangeSet(sbccChangeSet);
   logger.fine(getBitbucketName(bitbucketAuthenticationContext) + " "
     + getBitbucketEmail(bitbucketAuthenticationContext) + "> ChangeSet " + sbccChangeSet.getId() + " "
     + sbccChangeSet.getMessage() + " " + sbccChangeSet.getParentCount() + " "
     + sbccChangeSet.getCommitter().getEmailAddress() + " " + sbccChangeSet.getCommitter().getName());
   refChangeVerificationResult.setGroupsResult(sbccChangeSet,
     commitMessageValidator.validateChangeSetForGroups(settings, sbccChangeSet));
   refChangeVerificationResult.addAuthorEmailValidationResult(sbccChangeSet,
     commitMessageValidator.validateChangeSetForAuthorEmail(settings, sbccChangeSet, sbccRenderer));
   refChangeVerificationResult.addCommitterEmailValidationResult(sbccChangeSet,
     commitMessageValidator.validateChangeSetForCommitterEmail(settings, sbccChangeSet, sbccRenderer));
   refChangeVerificationResult.addAuthorNameValidationResult(sbccChangeSet,
     commitMessageValidator.validateChangeSetForAuthorName(settings, sbccChangeSet));
   refChangeVerificationResult.addCommitterNameValidationResult(sbccChangeSet,
     commitMessageValidator.validateChangeSetForCommitterName(settings, sbccChangeSet));
   refChangeVerificationResult.addContentSizeValidationResult(sbccChangeSet,
     commitContentValidator.validateChangeSetForContentSize(sbccChangeSet));
   refChangeVerificationResult.addContentDiffValidationResult(sbccChangeSet,
     commitContentValidator.validateChangeSetForContentDiff(sbccChangeSet));
   refChangeVerificationResult.addAuthorEmailInBitbucketValidationResult(sbccChangeSet,
     commitMessageValidator.validateChangeSetForAuthorEmailInBitbucket(settings, sbccChangeSet));
   refChangeVerificationResult.addAuthorNameInBitbucketValidationResult(sbccChangeSet,
     commitMessageValidator.validateChangeSetForAuthorNameInBitbucket(settings, sbccChangeSet));

   refChangeVerificationResult.setFailingJql(sbccChangeSet, jqlValidator.validateJql(sbccChangeSet));
   sbccRenderer.setSbccChangeSet(null);
  }
  return refChangeVerificationResult;
 }

 private boolean validateBranchName(String branchName) {
  return compile(settings.getBranchRejectionRegexp().or(".*")).matcher(branchName).find();
 }
}
