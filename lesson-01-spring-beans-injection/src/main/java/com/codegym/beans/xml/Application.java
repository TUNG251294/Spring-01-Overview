package com.codegym.beans.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        //phai co khoi tao ban dau
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("developer.xml");
        //khoi tao 2 doi tuong da set la bean, gio lay ra, phai cho ep kieu
        Developer fe = (Developer) context.getBean("frontend");
        System.out.println(fe);
        Developer be = (Developer) context.getBean("backend");
        System.out.println(be);

        ((ClassPathXmlApplicationContext) context).close();
    }
}
