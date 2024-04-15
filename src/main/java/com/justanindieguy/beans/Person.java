package com.justanindieguy.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Person {
  private String name;
  private final Vehicle vehicle;

  @Autowired // <- Optional when there is only one constructor in class
  public Person(Vehicle vehicle) {
    System.out.println("Person bean created by Spring!");
    this.vehicle = vehicle;
  }

  @PostConstruct
  public void initialize() {
    name = "John";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }
}
