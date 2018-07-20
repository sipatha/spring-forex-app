#!/usr/bin/env bash
#docker ps -a -q --filter="name=forex-app"
mvn clean install
docker build --rm=true --build-arg JAR_FILE=target/forex-app-0.0.1-SNAPSHOT.jar --file=Dockerfile --tag=spring-demo/forex-app:latest .
docker rmi $(docker images -f 'dangling=true' -q)
# docker run --publish 9000:9000 --network=spring-demo -i -t spring-demo/forex-app
