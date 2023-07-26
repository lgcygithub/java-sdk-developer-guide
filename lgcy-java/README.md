# lgcy

Lgcy-Java is a lightweight SDK that includes libraries for working with Lgcy system contracts and smart contracts.

Lgcy-Java makes it easy to build Lgcy applications with java.

[Lgcy-Java document](https://test.lgcyscan.network/developer-guide/lgcy-java-sdk)

Due to safety concerns, Lgcy-java will no longer upload packaged files to maven. Please clone the code from GitHub and do the packaging.

Lgcy-java is compiled with java version 1.8.0_231 and gradle 5.6.4.

## How to use

### Gradle Setting

Add repo setting:

```groovy
repositories {
    mavenCentral()
}
```

Then add required packages as dependencies. Please add dependencies locally.

```groovy
dependencies {
    // protobuf & grpc
    implementation 'com.google.protobuf:protobuf-java:3.11.0'

    implementation fileTree(dir:'../core')
    implementation fileTree(dir:'../utils')
    implementation fileTree(dir:'../abi')

    implementation 'com.google.guava:guava:28.0-jre'
}
```

Or if you are using the jar files as your dependencies:

```groovy
dependencies {
    implementation fileTree(dir:'your path', include: '*.jar')
}
```

### Maven Settings

```xml
<dependency>
  <groupId>org.lgcy.Legacy</groupId>
  <artifactId>abi</artifactId>
  <version>0.5.0</version>
  <scope>system</scope>
  <systemPath>your path</systemPath>
</dependency>
<dependency>
  <groupId>org.lgcy.Legacy</groupId>
  <artifactId>utils</artifactId>
  <version>0.5.0</version>
  <scope>system</scope>
  <systemPath>your path</systemPath>
</dependency>
<dependency>
  <groupId>org.lgcy.Legacy</groupId>
  <artifactId>core</artifactId>
  <version>0.5.0</version>
  <scope>system</scope>
  <systemPath>your path</systemPath>
</dependency>
