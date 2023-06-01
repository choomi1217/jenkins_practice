FROM openjdk:17
EXPOSE 8080
ADD build/libs/git-action-repository.jar git-action-repository.jar
ENTRYPOINT ["java","-jar","git-action-repository.jar"]