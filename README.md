### Maven and gradle task

1. Install [gradle](https://gradle.org/) and [maven](https://maven.apache.org/).
2. Create `build.gradle` and `pom.xml`.
3. Configure build in files from step above.

Requirements:

- `mvn clean install` Pass with `BUILD SUCCESS`
- `gradle clean build` Pass with `BUILD SUCCESS`
- JDK version 17 is used
- Do not remove `OkHttp` related code - it needs to be added as dependency in `build.gradle` and `pom.xml`

Maven tutorials:

- https://maven.apache.org/guides/getting-started/
- https://spring.io/guides/gs/maven/

Gradle tutorials:

- https://docs.gradle.org/current/samples/sample_building_java_applications.html
- https://spring.io/guides/gs/gradle/

This repository is part of [Java Expert](https://javaekspert.pl) online course.