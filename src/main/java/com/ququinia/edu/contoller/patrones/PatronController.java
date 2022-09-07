package com.ququinia.edu.contoller.patrones;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ququinia.edu.model.Patron;
import com.ququinia.edu.service.PatronService;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/patrones")
public class PatronController {

  @Autowired
  PatronService patronService;

  @GetMapping  
  public List<Patron> getPatrones() {
      System.out.println("getPatrones " + patronService.toString());
      return patronService.getAll();
  }



    
}
