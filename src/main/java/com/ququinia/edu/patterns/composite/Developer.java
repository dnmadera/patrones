package com.ququinia.edu.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Developer extends Employee {
  public Developer(int id, String name) {
    super(id, name);
  }

  @Override
  public List<Employee> directs() {
    return new ArrayList<Employee>();
  }
}