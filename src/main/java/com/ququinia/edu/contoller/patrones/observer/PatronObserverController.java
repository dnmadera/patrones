package com.ququinia.edu.contoller.patrones.observer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ququinia.edu.patterns.observer.CuadradoObserver;
import com.ququinia.edu.patterns.observer.Observer;
import com.ququinia.edu.patterns.observer.RaizCuadradaObserver;
import com.ququinia.edu.patterns.observer.Subject;
import com.ququinia.edu.service.PatronService;

@RestController
@RequestMapping("api/v1/patrones/observer")
public class PatronObserverController {

  @Autowired
  PatronService patronService;

  @GetMapping  
  public String execute() {
    long inicio = System.currentTimeMillis();
    String result = "Inicia ejecucion " + inicio;
    Subject subject = new Subject(6);
    Observer o = new RaizCuadradaObserver(subject);
    
    subject.attach(o);
    o = new CuadradoObserver(subject);
    subject.attach(o);

    subject.setState(4);

    long fin = System.currentTimeMillis();
    result += " -> Finaliza ejecucion " + fin + " total " + (fin - inicio) + "ms";



    return result;
  }



    
}
