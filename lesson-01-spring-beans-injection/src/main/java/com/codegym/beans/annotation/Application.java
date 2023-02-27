package com.codegym.beans.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigBeans.class);

        Developer fs = (Developer) context.getBean("fsDeveloper");
        System.out.println(fs);

        context.close();
    }
}
