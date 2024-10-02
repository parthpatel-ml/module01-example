package com.spring.professional.exam.tutorial.module01.question10.scopes.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class TrickSingleton {

    /*private TrickPrototype trickPrototype;

    @Autowired
    public TrickSingleton(TrickPrototype trickPrototype) {
        this.trickPrototype = trickPrototype;
        System.out.println("\n 00 TrickSingleton bean is created & CI of prototype  " + this.trickPrototype);
    }*/

    /*private TrickSession trickSession;

    public TrickSingleton(TrickSession trickSession) {
        this.trickSession = trickSession;
        System.out.println("\n 00 TrickSingleton bean is created & CI of session  " + this.trickSession);
    }*/
}
