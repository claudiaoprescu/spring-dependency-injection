package com.dependency.injection.springdependencyinjection.controller;

import com.dependency.injection.springdependencyinjection.service.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class PrimaryBeanController {

    private final GreetingService greetingService;

    public PrimaryBeanController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello() {
        return greetingService.sayHello();
    }
}
