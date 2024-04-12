package com.justanindieguy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.justanindieguy.beans.Person;
import com.justanindieguy.beans.Vehicle;

/*
 * Spring @Configuration annotation is part of the spring core framework.
 * Spring Configuration annotation indicates that the class has @Bean definition
 * methods. So Spring container can process the class and generate Spring Beans
 * to be used in the application.
 */
@Configuration
public class ProjectConfig {

  @Bean()
  Vehicle vehicle() {
    var veh = new Vehicle();
    veh.setName("Honda");
    return veh;
  }

  /*
   * Here in the below code, we are trying to wire or establish a relationship
   * between Person and Vehicle, by invoking the vehicle() bean method from
   * person() bean method.
   *
   * Spring will make sure to have only 1 vehicle bean is created and also
   * vehicle bean will be created first always as person bean has dependency on
   * it.
   */
  @Bean()
  public Person person() {
    Person person = new Person();
    person.setName("John");
    person.setVehicle(vehicle());
    return person;
  }

}
