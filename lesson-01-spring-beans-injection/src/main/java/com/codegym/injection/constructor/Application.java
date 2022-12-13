package com.codegym.injection.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructor-injection.xml");

        TextEditor textEditor = (TextEditor) context.getBean("textEditor");
        textEditor.spellCheck();

        ((ClassPathXmlApplicationContext) context).close();
    }
}
//    ApplicationContext là khái niệm Spring Boot dùng để chỉ Spring IoC container, tương tự như bean là đại diện cho các dependency.
//        Ngoài ra BeanFactory cũng đại loại như ApplicationContext, đại diện cho Spring IoC container nhưng ở mức cơ bản