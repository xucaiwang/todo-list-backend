FROM openjdk:17
WORKDIR /usr/src/app
COPY target/todo-list-backend-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/usr/src/app/app.jar"]
EXPOSE 8080


