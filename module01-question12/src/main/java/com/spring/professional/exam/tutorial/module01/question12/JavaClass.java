package com.spring.professional.exam.tutorial.module01.question12;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class JavaClass {

    @Value("${db.host}")
    private String dbHost;
    @Value("${app.envid}")
    private String appEndId;
    @Value("${external.service}")
    private String externalService;
    @Value("${JAVA_HOME}")
    private String javaHome;

    public void printProperties() {
        System.out.println("db.host = " + dbHost);
        System.out.println("app.envid = " + appEndId);
        System.out.println("external.service = " + externalService);
        System.out.println("JAVA_HOME = " + javaHome);
    }

    public static void main(String[] args) {
        JavaClass obj = new JavaClass();
        obj.printProperties();
    }
}
