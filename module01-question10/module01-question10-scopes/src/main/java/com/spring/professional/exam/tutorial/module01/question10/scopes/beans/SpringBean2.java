package com.spring.professional.exam.tutorial.module01.question10.scopes.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
@Scope("prototype")
public class SpringBean2 {

    @PreDestroy
    public void destroy2() {
        System.out.println("bean2 is destroy " + SpringBean2.class.getSimpleName());
    }
}
