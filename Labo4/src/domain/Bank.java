package domain;

import java.util.ArrayList;
import java.util.TreeSet;

public class Bank extends Subject{
    private TreeSet<Rekening> rekeningen;
    private String name;

    public Bank(String name) {
        this.rekeningen = new TreeSet<Rekening>();
        this.setName(name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addRekening(Rekening rekening) {
        int size = this.getAmount();
        this.rekeningen.add(rekening);
        if (size != this.getAmount()) this.notifyObservers();
    }

    public TreeSet<Rekening> getAll() {
        return rekeningen;
    }

    public int getAmount() {
        return this.rekeningen.size();
    }
}
