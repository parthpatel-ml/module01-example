package com.spring.professional.exam.tutorial.module01.question14.beans;

import org.springframework.stereotype.Component;

@Component
public class SpringBean4 {
    public SpringBean4() {
        System.out.println(getClass().getSimpleName() + "::Constructor");
    }
}
