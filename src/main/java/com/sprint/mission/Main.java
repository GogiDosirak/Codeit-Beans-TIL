package com.sprint.mission;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        TestService1 testService1 = context.getBean(TestService1.class);
        TestService2 testService2 = context.getBean(TestService2.class);
        System.out.println(testService1.getRepositoryValue());
        System.out.println(testService2.getRepositoryValue());

    }
}