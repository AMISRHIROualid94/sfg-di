package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {


    public String sayHello(){
        System.out.println("Hello world!");
        return "Hi Folks!";
    }
}
