package domain;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Rekening> rekeningen;
    private String name;
    private ArrayList<Observer> observers;

    public Bank(String name) {
        this.rekeningen = new ArrayList<>();
        this.observers = new ArrayList<>();
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
