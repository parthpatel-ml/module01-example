package com.spring.professional.exam.tutorial.module01.question10.scopes.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TrickPrototype {

    TrickSingleton trickSingleton;

    @Autowired
    public TrickPrototype(TrickSingleton trickSingleton) {
        this.trickSingleton = trickSingleton;
        System.out.println("\n 01 TrickPrototype Bean is created CI of Singleton " + this.trickSingleton + "\n");
    }
}
