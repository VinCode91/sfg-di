package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstructorInjectedControllerTest {

    private ConstructorInjectedController controller;

    @BeforeEach
    void setUp() {
        // Emulates what Spring does if we inject dependency through a constructor
        controller = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}
