package com.spring.professional.exam.tutorial.module01.question10.scopes.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class SpringBean1 {

    @PreDestroy
    public void destroy(){
        System.out.printf("Bean 1 is destroy");
    }
}
