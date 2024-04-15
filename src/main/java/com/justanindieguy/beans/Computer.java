package com.justanindieguy.beans;

public class Computer {

  private String name;

  public Computer() {
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Computer name is - " + name;
  }

}
