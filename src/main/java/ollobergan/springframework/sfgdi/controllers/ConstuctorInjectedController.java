package ollobergan.springframework.sfgdi.controllers;

import ollobergan.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstuctorInjectedController {

    private final GreetingService greetingService;
    @Autowired
    public ConstuctorInjectedController(@Qualifier("contructorGreetingService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting(){
        return greetingService.sayGreeting();
    }
}
