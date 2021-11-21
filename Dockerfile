FROM openjdk:8
ADD target/Docker-spring-boot.jar docker-spring-boot.jar
EXPOSE 8082
ENTRYPOINT ["java","-jar","Docker-spring-boot.jar"]