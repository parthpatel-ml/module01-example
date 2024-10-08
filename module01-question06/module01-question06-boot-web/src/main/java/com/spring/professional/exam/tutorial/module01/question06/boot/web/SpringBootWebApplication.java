package com.spring.professional.exam.tutorial.module01.question06.boot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootWebApplication {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringBootWebApplication.class);
        // we can modify application obj here.
        application.run(args);

        //SpringApplication.run(SpringBootWebApplication.class, args);
    }
}
