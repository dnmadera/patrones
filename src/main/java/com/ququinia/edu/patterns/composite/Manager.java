package com.ququinia.edu.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class Manager extends Employee {
  private List<Employee> directs = new ArrayList<>();

  public Manager(int id, String name) {
    super(id, name);
  }

  @Override
  public void add(Employee e) {
    directs.add(e);
  }

  @Override
  public void remove(Employee e) {
    directs.add(e);
  }

  @Override
  public Employee getChild(int i) {
    return directs.get(i);
  }

  @Override
  public List<Employee> directs() {
    return directs;
  }
}
