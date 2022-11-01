package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.exempleBeans.FakeData;
import guru.springframework.sfgdi.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    @Autowired
    private FakeData fakeData;
    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String hello(){
        System.out.println("Hello!!! ");
        return greetingService.sayGreeting();
    }

}
