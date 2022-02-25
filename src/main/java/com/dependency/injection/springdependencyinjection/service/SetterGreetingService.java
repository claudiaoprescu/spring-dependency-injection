package com.dependency.injection.springdependencyinjection.service;

import org.springframework.stereotype.Service;

public class SetterGreetingService implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello World in Setter";
    }
}
