package com.spring.professional.exam.tutorial.module01.question12;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        Stream.of(context.getBeanDefinitionNames()).forEach(System.out::println);
        context.registerShutdownHook();

        SpringBean bean = context.getBean(SpringBean.class);
        bean.printProperties();
    }
}
