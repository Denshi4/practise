package org.college.practise2.task4.p2;

import java.util.ArrayList;

public abstract class Observable {
    private ArrayList<Observer> _observers = new ArrayList<>();

    public void nootify(SystemAlert sysAl){
        for (Observer observer:
             _observers) {
            observer.nootifyy(sysAl);
        }
    }
    public void subscribe(Observer observer){
        _observers.add(observer);
    }
    public  void unsubscribe(Observer observer){
        _observers.remove(observer);
    }
}
