package guru.springframework.sfgdi.controllers;

import guru.springframework.sfgdi.services.GreetingService;
import guru.springframework.sfgdi.services.ProfileGreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class I18nController {

    private final ProfileGreetingService profileGreetingService;

    public I18nController(@Qualifier("i18nService")ProfileGreetingService profileGreetingService) {
        this.profileGreetingService = profileGreetingService;
    }
    public String sayHello(){
        return profileGreetingService.sayGreeting();
    }
    public String getProfile(){
        return profileGreetingService.getProfile();
    }
}
