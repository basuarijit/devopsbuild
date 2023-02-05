FROM openjdk:17
EXPOSE 8080
ADD target/devopsbuild.jar devopsbuild.jar
ENTRYPOINT ["java", "-jar", "devopsbuild.jar"]