## Eureka Naming Server

### created a naming server for two services:
- currency exchange
- currency conversion

Eureka Server Dependency:

pox.xml:
```
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-server</artifactId>
</dependency>
```

Eureka Client Dependency:
pox.xml (curr exchange and curr conversion poms):
```
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
</dependency>
```
application.properties (curr exchange and curr conversion):
```
eureka.client.service-url.defaultZone=http://localhost:8761/eureka
```