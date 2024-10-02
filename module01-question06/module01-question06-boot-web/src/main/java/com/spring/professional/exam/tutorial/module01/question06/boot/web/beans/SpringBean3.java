package com.spring.professional.exam.tutorial.module01.question06.boot.web.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class SpringBean3 {
    public SpringBean3() {
        System.out.println(getClass().getSimpleName() + "::constructor");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Bean 3 Destroy " + this.getClass().getSimpleName());
    }
}
