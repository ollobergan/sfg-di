package ollobergan.springframework.sfgdi.services;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectedGreetingService implements GreetingService{

    @Override
    public String sayGreeting(){
        return "Hello world-Setter";
    }
}
