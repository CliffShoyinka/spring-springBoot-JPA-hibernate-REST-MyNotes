package com.example.nain;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example6 {

    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext
                (ProjectConfig.class);
        Vehicle vehicle = context.getBean(Vehicle.class);
        System.out.println("Conponent Vehicle name from " +
                "Spring Context is: " +
                vehicle.getName());
        vehicle.printHello();
        context.close();
    }
}
