package ui;

import domain.*;

public class Main {
    public static void main(String[] args) {
        String phrase = "testje";

        EncodeBehaviour behaviour = new CeaserBehaviour();
        System.out.println("dit is originele tekst: " + phrase);
        System.out.println("dit is originele tekst geëncrypteerd: " + behaviour.encode(phrase));
        System.out.println("dit is geëncrypteerde tekst gedecrypteerd: " + behaviour.decode(behaviour.encode(phrase)));

        System.out.println("dit is met verplaatsing 5: " + behaviour.encode(phrase));

        CeaserBehaviour c = new CeaserBehaviour();
        System.out.println(c.encode("halloz ", -1));

        EncodeBehaviour d = new RandomEncodeAdapter();
        System.out.println(d.encode("hallo"));



    }



}
