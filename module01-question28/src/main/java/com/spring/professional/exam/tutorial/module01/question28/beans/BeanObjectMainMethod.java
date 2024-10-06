package com.spring.professional.exam.tutorial.module01.question28.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.objenesis.SpringObjenesis;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class BeanObjectMainMethod {
    @Value("John")
    private String name;

    @Value("${app.department.id}")
    private int departmentId;

    @Value("#{'Wall Street'.toUpperCase()}")
    private String streetName;


    public String getName() {
        return name;
    }

    public String getStreetName() {
        return streetName;
    }

    public int getDepartmentId() {
        return departmentId;
    }

    public static void main(String[] args) {
        BeanObjectMainMethod objectMainMethod = new BeanObjectMainMethod();
        System.out.println(objectMainMethod.getName());
        System.out.println(objectMainMethod.getStreetName());
        System.out.println(objectMainMethod.getDepartmentId());
    }
}
