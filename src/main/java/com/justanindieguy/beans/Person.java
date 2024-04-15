package com.justanindieguy.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Person {
  private String name;
  private final Vehicle vehicle;
  private final Computer computer;

  @Autowired
  public Person(@Qualifier("vehicle2") Vehicle vehicle, Computer computer) {
    System.out.println("Person bean created by Spring!");
    this.vehicle = vehicle;
    this.computer = computer;
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

  public Computer getComputer() {
    return computer;
  }
}
