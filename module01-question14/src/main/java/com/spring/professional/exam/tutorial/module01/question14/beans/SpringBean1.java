package com.spring.professional.exam.tutorial.module01.question14.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SpringBean1 implements InitializingBean, DisposableBean {
    @Autowired
    private SpringBean2 springBean2;

    public SpringBean1() {
        System.out.println(getClass().getSimpleName() + "::Constructor");
        System.out.println(getClass().getSimpleName() + "::Field Autowire " + this.springBean2);
    }

    @Autowired
    public SpringBean1(SpringBean2 springBean2) {
        this.springBean2 = springBean2;
        System.out.println(getClass().getSimpleName() + "::CI Autowire " + this.springBean2.getClass().getSimpleName());
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println(getClass().getSimpleName() + "::@PostConstruct");
        System.out.println(getClass().getSimpleName() + "::Field Autowire " + this.springBean2.getClass().getSimpleName());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(getClass().getSimpleName() + "::afterPropertiesSet()");
    }

    public void initMethod() {
        System.out.println(getClass().getSimpleName() + "::@Bean initMethod");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println(getClass().getSimpleName() + "::@PreDestroy");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println(getClass().getSimpleName() + "::destroy() from DisposableBean");
    }

    public void destroyMethod() {
        System.out.println(getClass().getSimpleName() + "::@Bean destroyMethod");
    }
}
