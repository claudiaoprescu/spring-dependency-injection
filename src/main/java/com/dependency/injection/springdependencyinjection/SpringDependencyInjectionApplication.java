package com.dependency.injection.springdependencyinjection;

import com.dependency.injection.springdependencyinjection.controller.ConstructorInjectionController;
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
