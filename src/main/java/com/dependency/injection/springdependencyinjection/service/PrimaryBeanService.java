package com.dependency.injection.springdependencyinjection.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Primary
@Service
public class PrimaryBeanService implements GreetingService {

    @Override
    public String sayHello() {
        return "Hello World from Primary Bean";
    }
}
