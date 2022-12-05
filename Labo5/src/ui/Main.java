package ui;

import domain.*;
import factory.EncodeBehaviourFactory;
import factory.EncodeBehaviourType;

public class Main {
    public static void main(String[] args) {
        String phrase = "test";

        Geheimschrift geheimschrift = new Geheimschrift();
//        geheimschrift.setEncodeBehaviour("RANDOMBEHAVIOUR");
//        geheimschrift.setEncodeBehaviour("CEASERBEHAVIOUR", 1);
        geheimschrift.setEncodeBehaviour("MIRRORINGBEHAVIOUR");
        geheimschrift.setGeheimschrift(phrase);


        System.out.println("dit is originele tekst: " + phrase);

        String encrypted = geheimschrift.encode();
        System.out.println("dit is originele tekst geëncrypteerd: " + encrypted);

        geheimschrift.setGeheimschrift(encrypted);

        System.out.println("dit is geëncrypteerde tekst gedecrypteerd: " + geheimschrift.decode());






    }



}
