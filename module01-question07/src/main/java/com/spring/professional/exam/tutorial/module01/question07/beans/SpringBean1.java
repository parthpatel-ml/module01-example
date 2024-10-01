package com.spring.professional.exam.tutorial.module01.question07.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class SpringBean1 implements InitializingBean, DisposableBean {

    private SpringBean2 springBean2;

    public SpringBean1() {
        System.out.println("\nCreating 4: " + getClass().getSimpleName());
    }

    @Autowired
    public void SpringBean1(SpringBean2 bean2){
        System.out.println("Extra 6 CI: settingProperty on \" + getClass().getSimpleName() + \" to inject \" + springBean2.getClass().getSimpleName()");
        this.springBean2 = bean2;
    }
    public void sayHello() {
        System.out.println("\nSay Hello Method 5: \n");
    }

    @Autowired
    public void setSpringBean2(SpringBean2 springBean2) {
        System.out.println("6 SI: settingProperty on " + getClass().getSimpleName() + " to inject " + springBean2.getClass().getSimpleName());
        this.springBean2 = springBean2;
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("7: @PostConstruct " + getClass().getSimpleName());
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("8: @PreDestroy " + getClass().getSimpleName());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("9: InitializingBean::afterPropertiesSet " + getClass().getSimpleName());
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("10: DisposableBean::destroy " + getClass().getSimpleName());
    }

    private void initMethod() {
        System.out.println("11: @Bean(initMethod) " + getClass().getSimpleName());
    }

    private void destroyMethod() {
        System.out.println("12: @Bean(destroyMethod) " + getClass().getSimpleName());
    }
}
