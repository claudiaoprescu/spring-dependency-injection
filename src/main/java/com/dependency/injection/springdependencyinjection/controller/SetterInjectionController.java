package com.dependency.injection.springdependencyinjection.controller;

import com.dependency.injection.springdependencyinjection.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class SetterInjectionController {

    private GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayHello();
    }

    @Qualifier("setterGreetingService")
    @Autowired
    public void setGreeting(GreetingService greetingService) {
        this.greetingService = greetingService;
    }
}
