package com.dependency.injection.springdependencyinjection.configuration;

import com.dependency.injection.springdependencyinjection.datasource.FakeDatasource;
import com.dependency.injection.springdependencyinjection.repository.EnglishGreetingRepository;
import com.dependency.injection.springdependencyinjection.repository.EnglishGreetingRepositoryImpl;
import com.dependency.injection.springdependencyinjection.service.ConstructorGreetingService;
import com.dependency.injection.springdependencyinjection.service.I18nEnglishGreetingService;
import com.dependency.injection.springdependencyinjection.service.I18nSpanishGreetingService;
import com.dependency.injection.springdependencyinjection.service.PetService;
import com.dependency.injection.springdependencyinjection.service.PetServiceFactory;
import com.dependency.injection.springdependencyinjection.service.PropertyGreetingService;
import com.dependency.injection.springdependencyinjection.service.SetterGreetingService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@PropertySource("classpath:datasource.properties")
@Configuration
public class GreetingServiceConfig {

    @Bean
    public FakeDatasource fakeDatasource(@Value("${db.username}") String username,
                                         @Value("${db.password}") String password,
                                         @Value("${db.dbUrl}") String dbUrl) {
        FakeDatasource fakeDatasource = new FakeDatasource();
        fakeDatasource.setUsername(username);
        fakeDatasource.setPassword(password);
        fakeDatasource.setDbUrl(dbUrl);
        return fakeDatasource;
    }

    @Bean
    public PetServiceFactory petServiceFactory() {
        return new PetServiceFactory();
    }

    @Profile({"dog", "default"})
    @Bean("petService")
    public PetService dogPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("dog");
    }

    @Profile("cat")
    @Bean("petService")
    public PetService catPetService(PetServiceFactory petServiceFactory) {
        return petServiceFactory.getPetService("cat");
    }

    @Bean
    public EnglishGreetingRepository englishGreetingRepository() {
        return new EnglishGreetingRepositoryImpl();
    }

    @Profile({"EN", "default"})
    @Bean("i18nService")
    public I18nEnglishGreetingService i18nEnglishGreetingService(EnglishGreetingRepository englishGreetingRepository) {
        return new I18nEnglishGreetingService(englishGreetingRepository);
    }

    @Profile("ES")
    @Bean
    public I18nSpanishGreetingService i18nService() {
        return new I18nSpanishGreetingService();
    }

    @Bean
    public SetterGreetingService setterGreetingService() {
        return new SetterGreetingService();
    }

    @Bean
    public PropertyGreetingService propertyGreetingService() {
        return new PropertyGreetingService();
    }

    @Bean
    public ConstructorGreetingService constructorGreetingService() {
        return new ConstructorGreetingService();
    }
}
