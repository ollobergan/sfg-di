package ollobergan.springframework.sfgdi.controllers;

import ollobergan.springframework.sfgdi.services.ContructorGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstuctorInjectedControllerTest {

    ConstuctorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstuctorInjectedController(new ContructorGreetingService());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}