package com.justanindieguy;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.justanindieguy.beans.Person;
import com.justanindieguy.beans.Vehicle;
import com.justanindieguy.config.ProjectConfig;

public class Main {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    Person person = context.getBean(Person.class);
    Vehicle vehicle = context.getBean(Vehicle.class);
    System.out.println("Person name from Spring Context is: " + person.getName());
    System.out.println("Vehicle name from Spring context is: " + vehicle.getName());
    System.out.println("Vehicle that Person owns is: " + person.getVehicle());
  }

}
