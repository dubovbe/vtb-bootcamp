package ru.dubov.vtb.lesson13;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Camera camera = context.getBean("camera", Camera.class);
        camera.doPhotograph();
        camera.breaking();
        camera.doPhotograph();
        camera = context.getBean("camera", Camera.class);
        camera.doPhotograph();
    }
}
