package com.dependency.injection.springdependencyinjection.repository;

public class EnglishGreetingRepositoryImpl implements EnglishGreetingRepository {

    @Override
    public String sayHello() {
        return "Hello World - EN";
    }
}
