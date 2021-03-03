# spring-cloud-microservices

#Docker

---

## Images
- Currency Exchange Service
  - v1 - docker.io/in28min/mmv2-currency-exchange-service:0.0.1-SNAPSHOT


## Urls

---
### Currency Exchange Service
http://localhost:8000/currency-exchange/from/USD/to/INR

### Currency Conversion Service
http://localhost:8100/currency-conversion/from/USD/to/INR/quantity/10   
http://localhost:8100/currency-conversion-feign/from/USD/to/INR/quantity/10

### Eureka
http://localhost:8761/

### API Gateway
http://localhost:8765/currency-exchange/from/USD/to/INR     
http://localhost:8765/currency-conversion/from/USD/to/INR/quantity/10   
http://localhost:8765/currency-conversion-feign/from/USD/to/INR/quantity/10         
http://localhost:8765/currency-conversion/from/USD/to/INR/quantity/10