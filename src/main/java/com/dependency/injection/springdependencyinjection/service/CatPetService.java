package com.dependency.injection.springdependencyinjection.service;

public class CatPetService implements PetService {
    @Override
    public String getPetType() {
        return "Cats Are the Best!";
    }
}
