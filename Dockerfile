FROM openjdk:17

WORKDIR /app

COPY build/libs/FabricaDocker-0.0.1-SNAPSHOT.jar FabricaDocker-0.0.1-SNAPSHOT.jar

EXPOSE 8083

CMD ["java", "-jar", "FabricaDocker-0.0.1-SNAPSHOT.jar"]