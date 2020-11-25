package ru.dubov.vtb.lesson13hw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        OrderService orderService = context.getBean("orderService", OrderService.class);

    }
}
