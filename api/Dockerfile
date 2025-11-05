FROM docker.io/library/maven:3.6.0-jdk-11-slim AS build

COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean install

#RUN apt-get update
#RUN apt-get install -y gss-ntlmssp

RUN update-ca-certificates
RUN sed -i '/^ssl_conf = ssl_sect$/s/^/#/' /etc/ssl/openssl.cnf


#
# Run stage
#
FROM docker.io/library/openjdk:11-jdk-slim
COPY --from=build /home/app/target/busmove-backend.jar /usr/local/lib/busmove-backend.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/usr/local/lib/busmove-backend.jar"]

