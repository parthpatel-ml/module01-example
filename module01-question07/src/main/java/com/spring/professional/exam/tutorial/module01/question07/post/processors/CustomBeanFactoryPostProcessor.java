package com.spring.professional.exam.tutorial.module01.question07.post.processors;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        // At this level you can access any property of each of the beans. Bean Definition properties.
        //configurableListableBeanFactory.getBeanDefinition("SpringBean1").
        System.out.println("1: "+getClass().getSimpleName() + " postProcessBeanFactory");
    }
}
