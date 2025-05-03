package org.API_Rest.restAPI.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    //@GetMapping
    @GetMapping
    public String welcome(){
        return "WELCOME TO MY SPRING BOOT WEB API";
    }

}
