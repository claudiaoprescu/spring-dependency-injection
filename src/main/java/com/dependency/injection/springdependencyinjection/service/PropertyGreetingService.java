package com.dependency.injection.springdependencyinjection.service;

import org.springframework.stereotype.Service;

@Service
public class PropertyGreetingService implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello World in Property";
    }
}
