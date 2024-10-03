package com.spring.professional.exam.tutorial.module01.question14.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;

public class SpringBean2 implements DisposableBean {
    public SpringBean2() {
        System.out.println(getClass().getSimpleName() + "::Constructor");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println(getClass().getSimpleName() + "::@PreDestroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(getClass().getSimpleName() + "::DisposableBean::destroy");
    }

    public void destroyMethod() {
        System.out.println(getClass().getSimpleName() + "::@Bean destroyMethod");
    }
}
