# Simple Bitbucket Commit Checker Changelog

Changelog of Simple Bitbucket Commit Checker.

## Unreleased
### No issue
  Reformat code
  
  [ecb147fe5ada92a](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/ecb147fe5ada92a) Tomas Bjerre *2016-10-11 15:30:11*

  Latest changelog lib and BBS 4.7.1
  
  [fa396c1ace1951a](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/fa396c1ace1951a) Tomas Bjerre *2016-07-10 06:57:25*

## 2.7
### GitHub [#55](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/issues/55) size-checker is checking files not part of the pushed change-set
  Only checking changed files for size
  
  [a58018f1da837c5](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/a58018f1da837c5) Tomas Bjerre *2016-06-23 13:47:31*

## 2.6
### GitHub [#53](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/issues/53) Slow in big instalaltions, with alot of users
  Caching file sizes
  
  [426e5f26c94fc31](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/426e5f26c94fc31) Tomas Bjerre *2016-06-22 16:50:48*

### No issue
  Adding script to setup Atlassian SDK
  
  [4c25126469090bf](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/4c25126469090bf) Tomas Bjerre *2016-06-21 19:46:07*

## 2.5
### GitHub [#49](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/issues/49) Case insensitive email addresses for commit author
  Checking email/name in commits with UserService  

 * Was loading all users from user service in a cache, every 5 minutes. This was causing performance issues and is now using https://developer.atlassian.com/static/javadoc/bitbucket-server/4.0.1/api/reference/com/atlassian/bitbucket/user/UserService.html#findUserByNameOrEmail(java.lang.String) instead.
  
  [b1553b16018fe50](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/b1553b16018fe50) Tomas Bjerre *2016-06-21 16:58:01*

### GitHub [#51](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/issues/51) Question: What defines what a &quot;service user&quot; is for the Accept Service Users checkbox?
  Adding link to explain service user
  
  [3679e3201f56d37](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/3679e3201f56d37) Tomas Bjerre *2016-04-20 19:03:49*

### GitHub [#53](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/issues/53) Slow in big instalaltions, with alot of users
  Checking email/name in commits with UserService  

 * Was loading all users from user service in a cache, every 5 minutes. This was causing performance issues and is now using https://developer.atlassian.com/static/javadoc/bitbucket-server/4.0.1/api/reference/com/atlassian/bitbucket/user/UserService.html#findUserByNameOrEmail(java.lang.String) instead.
  
  [b1553b16018fe50](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/b1553b16018fe50) Tomas Bjerre *2016-06-21 16:58:01*

### No issue
  Doc
  
  [323af977ada196f](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/323af977ada196f) Tomas Bjerre *2016-04-19 18:57:47*

## 2.4
### GitHub [#49](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/issues/49) Case insensitive email addresses for commit author
  Case insensitive email for committer and author
  
  [61be31c87654ea3](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/61be31c87654ea3) Tomas Bjerre *2016-03-01 17:49:04*

### No issue
  Correcting debug info in README.md
  
  [54e7e47fe773619](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/54e7e47fe773619) Tomas Bjerre *2016-02-24 18:17:54*

## 2.3
### GitHub [#48](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/issues/48) Excluding a user
  Optionally ignore users if there username matches a regular expression
  
  [249461408b8b6a1](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/249461408b8b6a1) Tomas Bjerre *2015-12-20 19:24:49*

## 2.2
### GitHub [#45](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/issues/45) sscc checking non-existing SHA
  Checking if object from treeWalker exists before loading it
  
  [7f3bd03f7daf9b6](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/7f3bd03f7daf9b6) Tomas Bjerre *2015-11-18 15:35:04*

  Only determining size of files in commits if that should be checked
  
  [64d398066eb846f](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/64d398066eb846f) Tomas Bjerre *2015-11-18 15:27:11*

### No issue
  Only determining diff of commit, if that will be checked
  
  [f79a6a21336fd51](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/f79a6a21336fd51) Tomas Bjerre *2015-11-18 15:44:36*

  Migrating Travis CI to container-based infrastructure
  
  [6070c6133a58a7e](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/6070c6133a58a7e) Tomas Bjerre *2015-09-26 17:51:55*

## 2.1
### No issue
  Building against Bitbucket 4.0.0

 * Was using EAP
  
  [effc2e22df33a2c](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/effc2e22df33a2c) Tomas Bjerre *2015-09-22 19:31:53*

## 2.0
### No issue
  Bitbucket 4.0 Compatible

 * Downloading Atlassian Plugin SDK from tar.gz archive in Travis
 * The APT repo is sometimes unavailable
  
  [bf5ae1c24fd2494](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/bf5ae1c24fd2494) Tomas Bjerre *2015-09-17 01:43:56*

  Removing SLF4J from pom.xml, not using it
  
  [d34d14c5d52a765](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/d34d14c5d52a765) Tomas Bjerre *2015-08-31 18:51:46*

## 1.14
### No issue
  Removing SLF4J usage to deal with classpath issues
  
  [4fde9be45f9eb20](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/4fde9be45f9eb20) Tomas Bjerre *2015-08-31 18:42:24*

  Reformatting some code
  
  [87d4b985c33b634](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/87d4b985c33b634) Tomas Bjerre *2015-08-30 11:29:17*

## 1.13
### GitHub [#43](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/issues/43) Variables: COMMITTER/AUTHOR_EMAIL/NAME
  Adding committer and author variables
  
  [08d7541a3158693](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/08d7541a3158693) Tomas Bjerre *2015-08-29 17:20:51*

## 1.12
### GitHub [#42](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/issues/42) Regex check to enforce branch names should apply when pushing new branch only
  Checking branch name, even if no commits are pushed
  
  [bd22a29f1eb992a](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/bd22a29f1eb992a) Tomas Bjerre *2015-08-24 18:56:58*

## 1.11
### GitHub [#41](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/issues/41) &quot;An error occured&quot; is shown every time users see a Pull Request
  "An error occured" is shown every time users see a Pull Request 
* Fixed by using SecurityService to get hook settings with ADMIN permissions as evaluated permission
  
  [948bcc9d8944a6a](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/948bcc9d8944a6a) Tomas Bjerre *2015-07-31 08:10:16*

## 1.10
### GitHub [#35](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/issues/35) Forks are not checked
  Checking pull requests
  
  [5905c1e6563d7ca](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/5905c1e6563d7ca) Tomas Bjerre *2015-06-22 09:41:42*

  Checking forks
  
  [3b9af58497d0c76](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/3b9af58497d0c76) Tomas Bjerre *2015-06-21 21:42:04*

### GitHub [#36](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/issues/36) Check pull requests
  Checking forks
  
  [3b9af58497d0c76](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/3b9af58497d0c76) Tomas Bjerre *2015-06-21 21:42:04*

### No issue
  Correcting LICENSE
  
  [f4dd5da91bc05e7](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/f4dd5da91bc05e7) Tomas Bjerre *2015-06-13 07:14:12*

## 1.9
### GitHub [#34](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/issues/34) Check that author/committer exists
  Can check that author name and/or email exists for any user in Stash
  
  [1303758230cd57a](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/1303758230cd57a) Tomas Bjerre *2015-06-10 21:29:59*

### No issue
  Updating screenshots
* Extending reject message example
* Update README.md
  
  [feb4c2de904cd57](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/feb4c2de904cd57) Tomas Bjerre *2015-06-10 16:47:14*

## 1.8
### GitHub [#27](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/issues/27) JQL check
  Check JQL query
  
  [33b341f32e37417](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/33b341f32e37417) Tomas Bjerre *2015-06-06 12:50:40*

## 1.7
### GitHub [#31](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/issues/31) Rule: Allow email to equal rendered string
  Allow email to equal rendered string
  
  [76f472eb54f8047](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/76f472eb54f8047) Tomas Bjerre *2015-06-03 16:19:35*

### No issue
  Updating changelog for 1.6
  
  [9ed9b249609fb7f](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/9ed9b249609fb7f) Tomas Bjerre *2015-06-03 10:08:48*

## 1.6
### GitHub [#30](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/issues/30) Rule: Check Committer
  Reporting if committer or author name was faulty
  
  [891ab293beed1e0](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/891ab293beed1e0) Tomas Bjerre *2015-06-03 10:02:01*

## 1.5
### GitHub [#28](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/issues/28) Allow specific usertypes to bypass checks
  Allow specific usertypes to bypass checks
  
  [8547c2676b54f2a](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/8547c2676b54f2a) Tomas Bjerre *2015-06-02 18:18:33*

### GitHub [#30](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/issues/30) Rule: Check Committer
  Check Committer
  
  [252a89b8972c693](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/252a89b8972c693) Tomas Bjerre *2015-06-02 17:27:48*

### GitHub [#32](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/issues/32) Rule: Reject based on branch name
  Reject based on branch name
  
  [14000fdfb821c84](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/14000fdfb821c84) Tomas Bjerre *2015-06-02 16:04:08*

## 1.4
### GitHub [#29](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/issues/29) Code is checking committer, not author, of commits
  Checking author against author instead of committer. Committer is the one pushing the commit
  
  [f02cb7462d58006](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/f02cb7462d58006) Tomas Bjerre *2015-06-01 15:44:07*

### No issue
  Using TreeMap instead of HashMap
* To avoid toggling test cases
  
  [adf39613253f65f](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/adf39613253f65f) Tomas Bjerre *2015-05-05 21:02:36*

## 1.3
### No issue
  Checking commit contents (diff) and total size of commit
  
  [26cc47256e9f15a](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/26cc47256e9f15a) Tomas Bjerre *2015-05-05 19:54:15*

  Moving validation code to its own class
* Not printing hook version. As long as the version number is not loaded from pom, it will surely be wrong in upcoming releases.
  
  [f3f1e51a0f352fa](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/f3f1e51a0f352fa) Tomas Bjerre *2015-05-03 18:27:42*

  Avoiding stacktraces in log when running test cases
  
  [9bf7ffef726fda0](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/9bf7ffef726fda0) Tomas Bjerre *2015-04-16 05:48:02*

## 1.2
### No issue
  Marking it as compatible with Atlassian Data Center
  
  [4e75aba5c631ef4](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/4e75aba5c631ef4) Tomas Bjerre *2015-04-16 05:29:55*

  Building with Oracle JDK 7 and 8 in Travis CI
  
  [b14f0c3298bd474](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/b14f0c3298bd474) Tomas Bjerre *2015-04-02 19:53:40*

## 1.1
### No issue
  Checking "Display Name" from Stash instead of "Name"
  
  [ff96a4c0c86cbfc](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/ff96a4c0c86cbfc) Tomas Bjerre *2015-03-10 17:07:48*

  Making ${STASH_EMAIL} and ${STASH_NAME} variables available in configurable messages
* Can be used to print out complete and correct commands, like:
  Set your correct email with: git config --global user.email ${STASH_EMAIL}
  
  [998cea775133e10](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/998cea775133e10) Tomas Bjerre *2015-03-08 19:46:56*

  Documentation
* Adding feature list to README.md
* Adding CHANGELOG.md
  
  [74bebc1ebd2f32d](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/74bebc1ebd2f32d) Tomas Bjerre *2015-03-07 01:37:57*

  Setting name and version in Java code instead of reading property
* sscc.properties not found when running application, atlas-run
* This partly reverts 0cdc98e
  
  [74ebff6d1badf71](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/74ebff6d1badf71) Tomas Bjerre *2015-03-06 20:18:12*

  Logging each reference change, and changeset, with Stash users name and email
  
  [4258ce2e22ad38a](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/4258ce2e22ad38a) Tomas Bjerre *2015-03-06 20:18:12*

  Printing name and version of plugin, in responses.
* To notify that the plugin is enabled
* To let developers know the name of this fantastic plugin =)
  
  [0cdc98e74623b8e](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/0cdc98e74623b8e) Tomas Bjerre *2015-03-06 07:56:24*

  Doing some cleanup
* Removing setting: SETTING_REQUIRE_ONLY_ONE_MATCHING_ISSUE, that feature was never implemented
* Refactoring test cases
* Reformatting some of the code
* Renamning functions
* Making plugin silent, if it has nothing to report
* Safely looking up Stash name, even if API returns null
* Building lowest, and highest, compatible version in Travis
* Building with -q in Travis, 4mb loggs makes Travis fail the build
* Cleaing up pom.xml
** Upgrading junit 4.10 to 4.12
** Upgrading gson 2.2.2-atlassian to 2.3.1
** Adding slf4j-simple on test classpath, enables logging in test cases
** Removing atlassian-plugins-osgi-testrunner, not using it
** Removing jsr311-api, not using it
** Removing plugin.testrunner property, not using it
  
  [5d81a39906b48b4](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/5d81a39906b48b4) Tomas Bjerre *2015-03-05 18:03:52*

  Update README.md
  
  [5e1f07468bc79aa](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/5e1f07468bc79aa) Tomas Bjerre *2015-03-05 09:31:07*

## 1.0
### No issue
  Fixing pom.xml for release
  
  [e492ea2c89e4f62](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/e492ea2c89e4f62) Tomas Bjerre *2015-03-04 08:58:57*

  Changing how rejection messages are presented
  
  [f03745ffe30debc](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/f03745ffe30debc) Tomas Bjerre *2015-03-03 20:57:23*

  Fixing save rule bug, better descriptions of fields, new GUI screenshot.
  
  [4d00b144f4e70ae](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/4d00b144f4e70ae) Tomas Bjerre *2015-03-03 17:49:44*

  Updating GUI image
  
  [a545bacf41f775a](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/a545bacf41f775a) Tomas Bjerre *2015-03-03 08:11:07*

  Admin gui
Update README.md
Settings in admin GUI can be saved and loaded.
Handling unexpected exceptions, allowing any refchange in that case
Reformating code
  
  [37a152651407b59](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/37a152651407b59) Tomas Bjerre *2015-03-02 22:22:33*

  Making CSS load in admin GUI
  
  [1076b51ed1c67af](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/1076b51ed1c67af) Tomas Bjerre *2015-02-27 13:06:17*

  Doing some work on the config GUI
  
  [52dade96e7c062f](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/52dade96e7c062f) Tomas Bjerre *2015-02-27 10:53:02*

  Basic functionality in place
* The plugin compiles and can be started with atlas-run
* Basic test cases are in place
* Very basic functionality is in place
  
  [bc5bc000d26f738](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/bc5bc000d26f738) Tomas Bjerre *2015-02-26 19:19:50*

  Initial commit
  
  [4c809b09492f6a1](https://github.com/tomasbjerre/simple-bitbucket-commit-checker/commit/4c809b09492f6a1) Tomas Bjerre *2015-02-24 22:52:56*

