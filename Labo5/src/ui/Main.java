package ui;

import domain.*;

public class Main {
    public static void main(String[] args) {
        String phrase = "test";

        Geheimschrift geheimschrift = new Geheimschrift();
        geheimschrift.setGeheimschrift(phrase);
        geheimschrift.setEncodeBehaviour(new CeaserBehaviour());
        System.out.println("dit is originele tekst: " + phrase);
        String encrypted = geheimschrift.encode();
        System.out.println("dit is originele tekst geëncrypteerd: " + encrypted);
        geheimschrift.setGeheimschrift(encrypted);
        System.out.println("dit is geëncrypteerde tekst gedecrypteerd: " + geheimschrift.decode());

        System.out.println("dit is met verplaatsing 5: " + geheimschrift.encode());





    }



}
