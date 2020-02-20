This repository has three microservices which explains how we can use zuul api gateway with eureka server and eureka client via spring application name.

There are 3 microservices

1. Eureka Naming Server
2. First Microservice
3. Second Microservice
4. Zuul microservice

Description: 

Eureka Naming Server: 
This microservice is nothing but serving as Eureka server. The other three microservices will register to this microservice or eureka server

First microservice:
This application register itself to eureka naming server 
It has one rest controller which will be called via zuul gateway. Server port for this app is 6062


Second microservice:
This application register itself to eureka naming server 
It has one rest controller which will be called via zuul gateway. Server port for this app is 7072

Zuul microservice
This application register itself to eureka naming server . Server port for this app is 8082

How to call microservices rest end points:
In order to call rest end point from either first or second microservice, we will be using Zuul. Zuul will take care to calling the respective microservice based on the application name

For first microservice
http://localhost:8082/zuul/first-microservice/firstMs
For second microservice
http://localhost:8082/zuul/second-microservice/secondMs



