package ui;

import domain.Auditor;
import domain.Bank;
import domain.Rekening;
import domain.RekeningLogger;

public class Main {
    public static void main(String[] args) {
        Bank b = new Bank("bank");

        b.addRekening(new Rekening("BE01230", 5204.50));

        System.out.println(b.getAmount());

        b.addObserver(new Auditor(b));
        b.addObserver(new RekeningLogger(b));

        b.addRekening(new Rekening("BE74102", 789.60));
        b.addRekening(new Rekening("BE74182", 789.60));

        System.out.println(b.getAll());
    }
}
