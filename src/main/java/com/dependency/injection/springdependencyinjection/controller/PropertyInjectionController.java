package com.dependency.injection.springdependencyinjection.controller;

import com.dependency.injection.springdependencyinjection.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectionController {

    @Qualifier("propertyGreetingService")
    @Autowired
    private GreetingService greetingService;

    public String getGreeting() {
        return greetingService.sayHello();
    }
}
