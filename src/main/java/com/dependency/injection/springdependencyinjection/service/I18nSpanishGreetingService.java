package com.dependency.injection.springdependencyinjection.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("ES")
@Service("i18nService")
public class I18nSpanishGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "Hola Mundo - ES";
    }
}
