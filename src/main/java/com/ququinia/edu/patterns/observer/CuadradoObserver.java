package com.ququinia.edu.patterns.observer;

public class  CuadradoObserver extends Observer{
    

    public CuadradoObserver(Subject sub) {
        this.subject = sub;
    }

    @Override
    public void update() {
        System.out.println(Math.pow(subject.getState(), 2));
        
        
    }
    
}
