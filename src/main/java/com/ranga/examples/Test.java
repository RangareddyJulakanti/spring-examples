package com.ranga.examples;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext();
        context.register(MyConfiguration.class);
        context.scan("com.ranga.examples");
        context.refresh();
        MyController myBean= (MyController) context.getBean("myController");
        myBean.m1();
    }
}
