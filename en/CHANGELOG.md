# CHANGELOG

## 4.0 (2023-08-01)

- Java coding conventions
  - Java version upgraded to 17.
  - New rules have been added due to Java version upgrade.
  - Some rules have been modified due to Java version upgrade.
- Java code formatter
  - Added instructions on how to configure IntelliJ IDEA and Eclipse.
  - Reviewed configuration file samples and recreated them for the latest version of IDE.
  - Added setting in EditorConfig.
- Checkstyle guide
  - CheckStyle version upgraded to 10.12.0.
  - New rules have been added due to CheckStyle version upgrade.
  - Reviewed configuration file and deleted some rules.
  - Reviewed configuration file and modified the severity of each rule to error.
  - Some rules related to formatting have been removed in consideration of the use of Java code formatter configuration file samples.
  - Java of sample project version upgraded to 17.
  - Source code of sample project has been modified due to modification of configuration file.
  - Plugin used to collect execution results in Jenkins is no longer supported, so changed plugin to use.
- SpotBugs guide
  - SpotBugs version upgraded to 4.7.3.
  - Java of sample project version upgraded to 17.
  - Sample code for standard detectable bugs has been added to sample project.
  - Plugin used to collect execution results in Jenkins is no longer supported, so changed plugin to use.
- Unauthorized API check tool
  - Java of sample project version upgraded to 17.
  - Authorized API of the Java standard library has been modified due to Java version upgrade.
  - Sample configuration file has been placed.
- ArchUnit Guide
  - ArchUnit version upgraded to 1.0.1.

## 3.2 (2022-10-31)

- NablarchDependencies are clearly indicated, and the concept of diverting to other frameworks is described.

## 3.1 (2022-03-31)

- SpotBugs maven plugin version upgraded to 4.5.0.0.
  This is to increase the number of detectable bugs by keeping up with the latest version.
  (SpotBugs4.X also experimentally supports Java 11 and newer.)
- Replaced with the unpublised API checker that is compatible with SpotBugs 4.X.

## 3.0 (2021-03-31)

- Add a user guide for Find Security Bugs
 
## 2.0 (2020-03-31)

- Add ArchUnit guide
  - An introductory and operational guide to utilizing ArchUnit, a tool for testing the architecture of source code, is now available.

## 1.0 (2018-09-28)

- First Version Public
