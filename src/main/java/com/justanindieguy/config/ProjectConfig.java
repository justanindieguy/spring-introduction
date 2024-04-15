package com.justanindieguy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.justanindieguy.beans.Person;
import com.justanindieguy.beans.Vehicle;

@Configuration
public class ProjectConfig {

  @Bean
  public Vehicle vehicle() {
    Vehicle vehicle = new Vehicle();
    vehicle.setName("Honda");
    return vehicle;
  }

  /*
   * Here in the below code, we are trying to wire or establish a relationship
   * between Person and Vehicle, by passing the vehicle as a method parameter to
   * the person() bean method.
   *
   * Spring injects the vehicle bean to the person bean using Dependency
   * Injection. Spring will make sure to have only 1 vehicle bean and also
   * vehicle bean will be created first always as person bean as dependency on
   * it.
   */
  @Bean
  public Person person(Vehicle vehicle) {
    Person person = new Person();
    person.setName("John");
    person.setVehicle(vehicle);
    return person;
  }

}
