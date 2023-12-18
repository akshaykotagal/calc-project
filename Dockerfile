#Dockerfile for running java application
FROM anapsix/alpine-java
MAINTAINER devopsuser@gmail.com
COPY target/CalcProject-0.2-jar-with-dependencies.jar /home/calcProject-0.2-jar-with-dependencies.jar
CMD ["java","-jar","/home/calcProject-0.2-jar-with-dependencies.jar","2","3","1"]