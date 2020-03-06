FROM openjdk:latest
COPY target/IIHT_CI_CD_Assignment-1.0.0-SNAPSHOT.jar /opt/app/
WORKDIR /opt/app
EXPOSE 8080
CMD java -jar IIHT_CI_CD_Assignment-1.0.0-SNAPSHOT.jar

