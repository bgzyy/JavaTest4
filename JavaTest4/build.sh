#!/bin/bash

mvn clean install

mv Exam1/target/exam4.jar docker/java

docker-compose build