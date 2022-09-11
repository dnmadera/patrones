package com.ququinia.edu.patrones;

import com.ququinia.edu.patterns.composite.Developer;
import com.ququinia.edu.patterns.composite.Employee;
import com.ququinia.edu.patterns.composite.Manager;
import com.ququinia.edu.patterns.observer.CuadradoObserver;
import com.ququinia.edu.patterns.observer.Observer;
import com.ququinia.edu.patterns.observer.RaizCuadradaObserver;
import com.ququinia.edu.patterns.observer.Subject;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class  ObserverTest{
    @Test
    void contextLoads() {
    }

    @Test
    void observerTest(){
            long inicio=System.currentTimeMillis();
            String result="Inicia ejecucion "+inicio;

            System.out.println("se genera el sujeto con un el estado 6");
            Subject subject=new Subject(6);
            Observer o=new RaizCuadradaObserver(subject);

            subject.attach(o);
            o=new CuadradoObserver(subject);
            subject.attach(o);

            System.out.println("Modifico estado a 4");
            subject.setState(4);

            long fin = System.currentTimeMillis();
            result += " -> Finaliza ejecucion " + fin + " total " + (fin - inicio) + "ms";
    }

}
