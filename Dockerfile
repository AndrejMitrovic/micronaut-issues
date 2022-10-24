FROM openjdk:14-alpine
COPY build/libs/arrayissue-*-all.jar arrayissue.jar
EXPOSE 8080
CMD ["java", "-Dcom.sun.management.jmxremote", "-Xmx128m", "-jar", "arrayissue.jar"]
