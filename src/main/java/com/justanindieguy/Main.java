package com.justanindieguy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.justanindieguy.beans.Vehicle;
import com.justanindieguy.config.ProjectConfig;

public class Main {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
    Vehicle vehicle = context.getBean(Vehicle.class);
    System.out.println("Component Vehicle name from Spring Context is: " + vehicle.getName());
    vehicle.printHello();
  }

}
