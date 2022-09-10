package com.ququinia.edu.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();
    
    private int state;


    public Subject(int state) {
        this.state = state;
    }


    public void attach(Observer o){
        observers.add(o);
    }
    

    public void notiyAllObservers(){


        for (Observer observer : observers) {
            observer.update();
        }

    }


    public int getState() {
        return state;
    }


    public void setState(int state) {
        this.state = state;
        notiyAllObservers();
    }
}




