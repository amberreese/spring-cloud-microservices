## API Gateway
- Created custom filters and routing for apis using Route Locator
- Handled a route redirect
- Created a logging filter using a global filter
- 


### Router examples:

Before:

    Eureka Client Registry:
    
    http://localhost:8765/currency-exchange/currency-exchange/from/USD/to/INR 
    http://localhost:8765/currency-conversion/currency-conversion-feign/from/USD/to/INR/quantity/10
    http://localhost:8765/currency-conversion/currency-conversion/from/USD/to/INR/quantity/10

After:

    http://localhost:8765/currency-exchange/from/USD/to/INR         
    http://localhost:8765/currency-conversion-feign/from/USD/to/INR/quantity/10
    http://localhost:8765/currency-conversion/from/USD/to/INR/quantity/10

    another version of currency-conversion-new with a redirect to currency-conversion-foreign
    http://localhost:8765/currency-conversion/from/USD/to/INR/quantity/10
