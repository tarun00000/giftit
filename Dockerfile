FROM maven:3.5-jdk-8 as BUILD
COPY . /usr/src/app

WORKDIR /usr/src/app

RUN mvn clean install -DskipTests


# Here we are making it multilayer image 
# Benefits of multilayer image that i dont need code anympre from line2
# i have my jar file already and thas what i want
# Helps to reduce docker image file
FROM openjdk:8-jre
COPY --from=BUILD /usr/src/app/target /opt/target
WORKDIR /opt/target
CMD ["java","-jar","spring-0.0.1-SNAPSHOT.war"]
