package com.dependency.injection.springdependencyinjection.service;

public class DogPetService implements PetService {
    @Override
    public String getPetType() {
        return "Dogs are the best!";
    }
}
