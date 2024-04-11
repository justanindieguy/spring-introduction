package com.justanindieguy.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Vehicle {

  private String name;

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

}
