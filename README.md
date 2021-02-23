### Introduction
This repo is a sample code to show the usage of an API Gateway. The project uses
[Spring Cloud Gateway](https://cloud.spring.io/spring-cloud-gateway/reference/html/) 
as the main API Gateway. In addition, the Gateway integrates
with [Consul](https://www.consul.io/) as the Service Discovery.
The objective of this project is three folds:
- Utilize an API Gateway
- Configure and utilize Consul as the main discovery service
- Services are referenced by name and not IP/port

### Services
There are 3 services created in this sample project:
- [gateway](/gateway): this is the Spring Cloud Gateway
- [service1](/service1): this is the service that is exposed by the gateway. This 
service is written using [micronaut](https://micronaut.io)
- [service2](/service2): this service is reference by service1. This 
service is written using [micronaut](https://micronaut.io)

### Requirements
- Java 11. The services are set to use java 11
- Docker. Consul is started using docker

### Running
First we need to start Consul by running [run-consul.sh](run-consul.sh). This script
uses docker to pull the latest consul image and runs it locally. After consul start,
the UI will be available at: [http://localhost:8500](http://localhost:8500)

After consul start, the other services can also start up using the following command:
```
./run-services.sh
```
Once all the services are started, the Gateway will forward `/api/billing' to service1. 
Then, service1 will utilize service2 for some of the information.

To stop the services run the following command:
```
./stop-services.sh
```