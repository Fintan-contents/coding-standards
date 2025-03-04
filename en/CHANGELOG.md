# CHANGELOG

## 5.1 (2025-03-27)

- SpotBugs guide
  - Unauthorized API check tool version upgraded to 1.0.1.

## 5.0 (2024-09-30)

- Checkstyle guide
  - Maven CheckStyle Plugin version upgraded to 3.4.0.
  - CheckStyle version upgraded to 10.17.0.
- SpotBugs guide
  - SpotBugs Maven Plugin version upgraded to 4.8.6.2.
  - Find Security Bugs version upgraded to 1.13.0.
- Unauthorized API check tool
  - With the support of Jakarta EE, we have changed to refer to the latest version of Nablarch's configuration file as a sample configuration file.
- ArchUnit Guide
  - ArchUnit version upgraded to 1.3.0.
- JavaScript Style guide
  - The acronyms of specification in Java EE used in the Readme changed to the Jakarta EE specification name.
- JSP Style guide
  - The acronyms of specification in Java EE used in the Readme and title of coding convention changed to the Jakarta EE specification name.
  - For the acronyms of specification in Java EE used in the coding convention, the reading to the Jakarta EE specification is noted.

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
