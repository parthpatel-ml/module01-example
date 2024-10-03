package com.spring.professional.exam.tutorial.module01.question10.scopes.web.beans;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@Scope("session") // @SessionScope
public class SpringBean4 {
}
