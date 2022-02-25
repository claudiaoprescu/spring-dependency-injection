package com.dependency.injection.springdependencyinjection.service;

import com.dependency.injection.springdependencyinjection.repository.EnglishGreetingRepository;

public class I18nEnglishGreetingService implements GreetingService {

    private EnglishGreetingRepository englishGreetingRepository;

    public I18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        this.englishGreetingRepository = englishGreetingRepository;
    }

    @Override
    public String sayHello() {
        return englishGreetingRepository.sayHello();
    }
}
