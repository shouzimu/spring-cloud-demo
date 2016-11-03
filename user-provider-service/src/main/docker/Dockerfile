FROM java:8
VLOUME /tmp
ADD user-provider-service-1.0-SNAPSHOT.jar app.jar
RUN bash -c 'touch  /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
