Forex App
=

Offer exchange rates and forex conversion service to Awesome Bank client

Creating Docker Image
-

`docker build --rm=true --build-arg JAR_FILE=target/forex-app-0.0.1-SNAPSHOT.jar --file=Dockerfile --tag=spring-demo/forex-app:latest .`

Run Docker Image
-

`docker run --publish 9000:9000 --network=spring-demo -i -t spring-demo/forex-app`

Accessing The Web Service
-

`curl http://localhost:9000/forex-rate-service/rate/USD/ZAR | json_pp`
 