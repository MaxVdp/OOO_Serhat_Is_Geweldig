package domain;

import java.util.ArrayList;

public class Subject {
    protected ArrayList<Observer> observers;

    public Subject() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer o){
        this.observers.add(o);
    }

    public void notifyObservers(){
        observers.forEach( e -> e.update());
    }
}
