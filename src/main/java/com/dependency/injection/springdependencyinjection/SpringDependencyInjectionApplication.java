package com.dependency.injection.springdependencyinjection;

import com.dependency.injection.springdependencyinjection.controller.ConstructorInjectionController;
import com.dependency.injection.springdependencyinjection.controller.I18nController;
import com.dependency.injection.springdependencyinjection.controller.PetController;
import com.dependency.injection.springdependencyinjection.controller.PrimaryBeanController;
import com.dependency.injection.springdependencyinjection.controller.PropertyInjectionController;
import com.dependency.injection.springdependencyinjection.controller.SetterInjectionController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDependencyInjectionApplication {

    public static void main(String[] args) {
        final ConfigurableApplicationContext ctx = SpringApplication.run(SpringDependencyInjectionApplication.class, args);

        PetController petController = (PetController) ctx.getBean("petController");
        System.out.println("--- The Best Pet is ---");
        System.out.println(petController.whichPetIsTheBest());

        I18nController i18nController = (I18nController) ctx.getBean("i18nController");
        System.out.println("I18n -------- " + i18nController.sayHello());

        PrimaryBeanController primaryBeanController = (PrimaryBeanController) ctx.getBean("primaryBeanController");
        System.out.println("Primary Bean -------- " + primaryBeanController.sayHello());

        PropertyInjectionController propertyInjectionController = (PropertyInjectionController) ctx.getBean("propertyInjectionController");
        System.out.println("Property ------ " + propertyInjectionController.getGreeting());

        SetterInjectionController setterInjectionController = (SetterInjectionController) ctx.getBean("setterInjectionController");
        System.out.println("Setter ------ " + setterInjectionController.getGreeting());

        ConstructorInjectionController constructorInjectionController = (ConstructorInjectionController) ctx.getBean("constructorInjectionController");
        System.out.println("Constructor ------ " + constructorInjectionController.getGreeting());


    }

}
