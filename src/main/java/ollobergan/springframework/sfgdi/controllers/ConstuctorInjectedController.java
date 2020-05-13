package ollobergan.springframework.sfgdi.controllers;

import ollobergan.springframework.sfgdi.services.GreetingService;

public class ConstuctorInjectedController {

    private final GreetingService greetingService;

    public ConstuctorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
