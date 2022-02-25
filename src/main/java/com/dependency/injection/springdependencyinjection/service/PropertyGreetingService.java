package com.dependency.injection.springdependencyinjection.service;

public class PropertyGreetingService implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello World in Property";
    }
}
