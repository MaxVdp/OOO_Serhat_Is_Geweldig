package domain;

import java.util.ArrayList;

public class Bank extends Subject{
    private ArrayList<Rekening> rekeningen;
    private String name;

    public Bank(String name) {
        this.rekeningen = new ArrayList<>();
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRekening(Rekening rekening) {
        this.rekeningen.add(rekening);
        this.notifyObservers();
    }

    public ArrayList<Rekening> getAll() {
        return rekeningen;
    }

    public int getAmount() {
        return this.rekeningen.size();
    }
}
