package com.spring.professional.exam.tutorial.module01.question06.boot.web.beans;

import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

@Component
public class SpringBean2 {
    public SpringBean2() {
        System.out.println(getClass().getSimpleName() + "::constructor");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Bean 2 Destroy " + this.getClass().getSimpleName());
    }
}
