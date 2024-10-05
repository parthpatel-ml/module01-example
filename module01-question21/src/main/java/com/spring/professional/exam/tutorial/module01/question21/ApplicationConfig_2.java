package com.spring.professional.exam.tutorial.module01.question21;

import com.spring.professional.exam.tutorial.module01.question21.beans.*;
import org.apache.commons.codec.digest.DigestUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.security.MessageDigest;
import java.util.Arrays;

@Configuration
public class ApplicationConfig_2 implements BeanFactoryPostProcessor {

    @Bean(initMethod = "init")
    @Autowired
    public SpringBean1 springBean1(SpringBean2 springBean2, SpringBean3 springBean3rd) {
        return new SpringBean1(springBean2, springBean3rd); //  @Bean(name = "springBean3rd")

    }

    @Bean(destroyMethod = "destroy")
    public SpringBean2 springBean2() {
        return new SpringBean2();
    }

    @Bean
    public SpringBean3 springBean3C() {
        return new SpringBean3C();
    }

    @Autowired
    @Bean(name = "springBean3rd")
    public SpringBean3 springBean3A(MessageDigest messageDigest) {
        return new SpringBean3A(messageDigest);
    }

    @Bean
    public SpringBean3 springBean3B() {
        return new SpringBean3B();
    }



    @Bean
    public MessageDigest messageDigest() {
        return DigestUtils.getSha384Digest();
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        Arrays.stream(beanFactory.getBeanDefinitionNames()).forEach(System.out::println);
    }
}
