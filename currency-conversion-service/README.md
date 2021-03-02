## Example: Proxy Currency Conversion Service

###created a proxy for Currency Conversion Service to talk with the Currency Exchange Service

OpenFeign Dependency:
```
<dependency>
    <groupId>org.springframework.cloud</groupId>
    <artifactId>spring-cloud-starter-openfeign</artifactId>
</dependency>
```

Annotations:

CurrencyExchangeProxy.java:
```
 // name = name of application specified in application.properties (if applicable)
@FeignClient(name = "currency-exchange", url = "localhost:8000")
public interface CurrencyExchangeProxy {.. .}
```
CurrencyConversionServiceApplication.java:
```
@SpringBootApplication
@EnableFeignClients
public class CurrencyConversionServiceApplication {...}
```


