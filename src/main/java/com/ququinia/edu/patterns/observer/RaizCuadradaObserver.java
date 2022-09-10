package com.ququinia.edu.patterns.observer;

public class  RaizCuadradaObserver extends Observer{

    public RaizCuadradaObserver(Subject sub) {
        this.subject = sub;
    }

    @Override
    public void update() {
        System.out.println(Math.sqrt(subject.getState()));
        
        
    }
    
}
