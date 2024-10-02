package com.spring.professional.exam.tutorial.module01.question10.scopes.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("session")
public class TrickSession {

    public TrickSession() {
        System.out.println(" TrickSession Bean is created ");
    }

}
