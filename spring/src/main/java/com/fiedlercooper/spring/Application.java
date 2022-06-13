package com.fiedlercooper.spring;

import java.util.Arrays;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	@Bean
    public CommandLineRunner commandRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("inspect the Beans from Spring");
            String[] beanName = ctx.getBeanDefinitionNames();
            Arrays.sort(beanName);
            for(String bName: beanName) {
                System.out.println(bName);
            }
                    
        };
    }

}
