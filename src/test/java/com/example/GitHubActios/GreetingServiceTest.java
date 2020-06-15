package com.example.GitHubActios;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.springframework.test.util.AssertionErrors.assertEquals;

@SpringBootTest
public class GreetingServiceTest {

    private GreetingService greetingService;

    @BeforeEach
    public void setup() {
        greetingService = new GreetingService();
    }

    @Test
    public void whenNameIsValid_sayHello() {
        var greeting = greetingService.sayHello("Amr");
        assertEquals(
                "greeting message is not as expected",
                "Hello Amr",
                greeting);
    }
}
