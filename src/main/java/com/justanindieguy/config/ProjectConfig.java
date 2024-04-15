package com.justanindieguy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.justanindieguy.beans.Computer;
import com.justanindieguy.beans.Vehicle;

@Configuration
@ComponentScan(basePackages = "com.justanindieguy.beans")
public class ProjectConfig {

  @Bean
  Vehicle vehicle1() {
    var vehicle = new Vehicle();
    vehicle.setName("Audi");
    return vehicle;
  }

  @Bean
  Vehicle vehicle2() {
    var vehicle = new Vehicle();
    vehicle.setName("Honda");
    return vehicle;
  }

  @Bean
  Vehicle vehicle3() {
    var vehicle = new Vehicle();
    vehicle.setName("Ferrari");
    return vehicle;
  }

  @Bean
  Computer computer1() {
    var computer = new Computer();
    computer.setName("Linux Laptop");
    return computer;
  }

  @Bean
  @Primary
  Computer computer2() {
    var computer = new Computer();
    computer.setName("Windows Laptop");
    return computer;
  }

}
