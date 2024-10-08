package com.spring.professional.exam.tutorial.module01.question14;

import com.spring.professional.exam.tutorial.module01.question14.beans.SpringBean1;
import com.spring.professional.exam.tutorial.module01.question14.beans.SpringBean2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
public class ApplicationConfiguration {
    public ApplicationConfiguration() {
        System.out.println(getClass().getSimpleName() + "::Constructor");
    }

    @Bean
    public static CustomBeanFactoryPostProcessor factoryPostProcessor(){
        return new CustomBeanFactoryPostProcessor();
    }

    @Bean
    public static CustomBeanPostProcessor customBeanPostProcessor() {
        return new CustomBeanPostProcessor();
    }

    @Bean(initMethod = "initMethod", destroyMethod = "destroyMethod")
    public SpringBean1 springBean1() {
        return new SpringBean1();
    }

    @Bean(destroyMethod = "destroyMethod")
    public SpringBean2 springBean2() {
        return new SpringBean2();
    }
}
