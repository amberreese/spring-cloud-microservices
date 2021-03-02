package com.in28minutes.microservices.currencyexchangeservice;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.core.env.Environment;
import org.springframework.test.util.ReflectionTestUtils;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class CurrencyExchangeControllerTest {



    @Test
    void retrieveExchangeValue() {

        CurrencyExchangeRepository repository = mock(CurrencyExchangeRepository.class);

        CurrencyExchange value = new CurrencyExchange();
        when(repository.findByFromAndTo("USD", "INR")).thenReturn(value);

        Environment environment = mock(Environment.class);

        when(environment.getProperty("local.server.port")).thenReturn("3000");

        CurrencyExchangeController controller = new CurrencyExchangeController(repository, environment);

        CurrencyExchange currencyExchange = controller.retrieveExchangeValue("USD", "INR");

        assertSame(value, currencyExchange);
        assertEquals("3000", currencyExchange.getEnvironment());
    }
}