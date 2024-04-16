package com.justanindieguy.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Vehicle {
  private String name;

  @Autowired // <- Circular Dependency
  private Person person;

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

  public void setPerson(Person person) {
    this.person = person;
  }

  public Person getPerson() {
    return person;
  }

  @Override
  public String toString() {
    return "Vehicle name is - " + name;
  }
}
