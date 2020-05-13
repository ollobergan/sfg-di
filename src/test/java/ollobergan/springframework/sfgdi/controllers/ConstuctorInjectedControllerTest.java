package ollobergan.springframework.sfgdi.controllers;

import ollobergan.springframework.sfgdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConstuctorInjectedControllerTest {

    ConstuctorInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new ConstuctorInjectedController(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}