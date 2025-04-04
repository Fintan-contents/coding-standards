# Method to Run SpotBugs in Maven

This document will guide you how to configure and run SpotBugs with Maven.

The contents of this document have been verified with Maven 3.9.8.

## Deploy filter files to exclude checks

Include [Filter file](../spotbugs-example/spotbugs/spotbugs_exclude_for_production.xml) in any folder under the project directory. 
Assume that it is deployed in `${basedir}/spotbugs/spotbugs_exclude_for_production.xml`.

## Deploy the configuration file of the unauthorized API check tool

Save the configuration file of the unauthorized API check tool in any location under the project directory.
Assume that the configuration files are saved in the `${basedir}/spotbugs/published-config/production`.

- [JavaOpenApi.config](../spotbugs-example/spotbugs/published-config/production/JavaOpenApi.config)
- [NablarchApiForProgrammer.config](../spotbugs-example/spotbugs/published-config/production/NablarchApiForProgrammer.config)

## Incorporate SpotBugs Maven Plugin

Edit `pom.xml`.
Add the configuration of `spotbugs-maven-plugin`, and specify the path of the filter file and path of the directory where the configuration files of the unauthorized API check tool are located.
Also specify the heap size as needed.

The location to add the configuration is directly under `build`, which is directly under `plugins`.

```xml
<plugin>
  <groupId>com.github.spotbugs</groupId>
  <artifactId>spotbugs-maven-plugin</artifactId>
  <version>4.8.6.2</version>
  <configuration>
    <xmlOutput>true</xmlOutput>
    <!-- Filter file to exclude checks -->
    <excludeFilterFile>spotbugs/spotbugs_exclude_for_production.xml</excludeFilterFile>
    <!-- Configuration file of the unauthorized API check tool -->
    <jvmArgs>-Dnablarch-findbugs-config=spotbugs/published-config/production</jvmArgs>
    <!-- If the heap size is insufficient, it can be increased -->
    <maxHeap>1024</maxHeap>
    <plugins>
      <plugin>
        <groupId>com.nablarch.framework</groupId>
        <artifactId>nablarch-unpublished-api-checker</artifactId>
        <version>1.0.1</version>
      </plugin>
    </plugins>
  </configuration>
</plugin>
```

If the filter file does not exist in the path described in `pom.xml`, the following error will be seen when checked by the method described below.

```
[ERROR] Could not find resource 'spotbugs/spotbugs_exclude_for_production.xml'. -> [Help 1]
```

If the directory where the configuration file of the unauthorized API check tool is saved does not exist in the path described in `pom.xml`, the following exception is thrown when a check attempted in the manner described later.

```
[java] Caused by: java.lang.RuntimeException: Config file directory doesn't exist.Path=[spotbugs/published-config/production]
```

If you get such an error or exception, check the file path described in `pom.xml` and the actual location where the file is saved.

## Perform checks with Maven

The check can be performed with the following command.

```sh
mvn spotbugs:check
```

※When checking, the class file must be output under the target directory. If the class file is not output, please execute the following command.

```sh
mvn compile
```

If there is a check violation, the following points are output to the console:

```
[INFO] BugInstance size is 1
[INFO] Error size is 0
[INFO] Total bugs: 1
[ERROR] Medium: Comparison of String objects using == or != in com.example.ComparingStringsWithEq.example() [com.example.ComparingStringsWithEq] At ComparingStringsWithEq.java:[line 11] ES_COMPARING_STRINGS_WITH_EQ
```

If all checks are passed, they are output to the console as follows:

```
[INFO] BugInstance size is 0
[INFO] Error size is 0
[INFO] No errors/warnings found
```
