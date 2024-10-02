package com.spring.professional.exam.tutorial.module01.question10.scopes;

import com.spring.professional.exam.tutorial.module01.question10.scopes.beans.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static java.lang.System.out;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

        context.registerShutdownHook();

        out.println("1 "+context.getBean(SpringBean1.class));
        out.println("2 "+context.getBean(SpringBean1.class));
        out.println("3 "+context.getBean(SpringBean1.class));

        out.println("4 "+context.getBean(SpringBean2.class));
        out.println("5 "+context.getBean(SpringBean2.class));
        out.println("6 "+context.getBean(SpringBean2.class));

        out.println("8 "+context.getBean(TrickSingleton.class));
        out.println("9 "+context.getBean(TrickSingleton.class));
        out.println("10 "+context.getBean(TrickSingleton.class));
        out.println("11 "+context.getBean(TrickPrototype.class));
        out.println("12 "+context.getBean(TrickPrototype.class));
        out.println("13 "+context.getBean(TrickPrototype.class));

        /*try{
            Thread.sleep(100000);

        }catch (Exception e){
            System.out.println(e.getStackTrace());
        }*/

        AnnotationConfigApplicationContext newContext = refreshContext(context);

        out.println("13 " +newContext.getBean(SpringBean1.class));
        out.println("14 " +newContext.getBean(SpringBean1.class));
        out.println("15 " +newContext.getBean(SpringBean1.class));

        out.println("16 " +newContext.getBean(SpringBean2.class));
        out.println("17 " +newContext.getBean(SpringBean2.class));
        out.println("18 " +newContext.getBean(SpringBean2.class));

        out.println("19 " +newContext.getBean(TrickSingleton.class));
        out.println("20 " +newContext.getBean(TrickSingleton.class));
        out.println("21 " +newContext.getBean(TrickSingleton.class));
        out.println("22 " +newContext.getBean(TrickPrototype.class));
        out.println("23 " +newContext.getBean(TrickPrototype.class));
        out.println("24 " +newContext.getBean(TrickPrototype.class));

//        out.println("25 " +newContext.getBean(TrickSession.class));
    }

    private static AnnotationConfigApplicationContext refreshContext(AnnotationConfigApplicationContext oldContext) {
        out.println("\n old context is closed \n");
        oldContext.close();
        out.println("\n new context created \n");

        return new AnnotationConfigApplicationContext(ApplicationConfiguration.class);

    }
}
