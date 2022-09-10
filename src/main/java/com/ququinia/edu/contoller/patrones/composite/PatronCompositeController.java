package com.ququinia.edu.contoller.patrones.composite;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ququinia.edu.patterns.composite.Developer;
import com.ququinia.edu.patterns.composite.Employee;
import com.ququinia.edu.patterns.composite.Manager;


@RestController
@RequestMapping("api/v1/patrones/composite")
public class PatronCompositeController {

  
  @GetMapping  
  public String execute() {
    long inicio = System.currentTimeMillis();
    String result = "Inicia ejecucion " + inicio;
    
    
  // creating a bunch of developers 
    Developer john = new Developer(101, "John"); 
    Developer robin = new Developer(102, "Robin"); 
    Developer peter = new Developer(103, "Peter"); 
    Developer luke = new Developer(104, "Luke"); 
    Developer amy = new Developer(105, "Amy"); 
    
    // creating a manager and adding developers under him 
    Manager steve = new Manager(106, "Steve"); 
    steve.add(john); steve.add(robin); steve.add(peter); 
    
    // creating another manager and adding his directs 
    Manager frank = new Manager(107, "Frank"); 
    frank.add(luke); frank.add(amy); frank.add(steve); 
    
    // creating a list of Employee 
    List<Employee> org = new ArrayList<Employee>(); 
    org.add(john); org.add(robin); org.add(peter); org.add(luke); 
    org.add(amy); org.add(steve); org.add(frank); 
    
    // iterating over all employees 
    for (Employee e : org) { 
      System.out.printf("%s manages %s %n", e.getName(), e.directs()); 
    } 
  

//Read more: https://javarevisited.blogspot.com/2018/02/composite-design-pattern-in-java-real.html#ixzz7eRG1iXmo





    long fin = System.currentTimeMillis();
    result += " -> Finaliza ejecucion " + fin + " total " + (fin - inicio) + "ms";



    return result;
  }



    
}
