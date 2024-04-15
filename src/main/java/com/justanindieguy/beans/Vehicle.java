package com.justanindieguy.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Vehicle {
  private String name;

  public Vehicle() {
    System.out.println("Vehicle bean created by Spring!");
  }

  @PostConstruct
  public void initialize() {
    name = "Honda";
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void printHello() {
    System.out.println("Printing Hello from Component Vehicle Bean");
  }

  @Override
  public String toString() {
    return "Vehicle name is - " + name;
  }
}
