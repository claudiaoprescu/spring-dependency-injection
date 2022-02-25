package com.dependency.injection.springdependencyinjection.configuration;

import com.dependency.injection.springdependencyinjection.service.ConstructorGreetingService;
import com.dependency.injection.springdependencyinjection.service.I18nEnglishGreetingService;
import com.dependency.injection.springdependencyinjection.service.I18nSpanishGreetingService;
import com.dependency.injection.springdependencyinjection.service.PropertyGreetingService;
import com.dependency.injection.springdependencyinjection.service.SetterGreetingService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Profile({"EN", "default"})
    @Bean("i18nService")
    public I18nEnglishGreetingService i18nEnglishGreetingService() {
        return new I18nEnglishGreetingService();
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