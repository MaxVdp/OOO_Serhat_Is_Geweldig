package ui;

import domain.CeaserBehaviour;
import domain.EncodeBehaviour;
import domain.Geheimschrift;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        String phrase = "testje";

        CeaserBehaviour cs = new CeaserBehaviour();
        System.out.println("dit is originele tekst " + phrase);
        System.out.println(cs.encode(phrase));
        System.out.println(cs.decode(cs.encode(phrase)));
        System.out.println("dit is met verplaatsing -5: " + cs.encode(phrase, -1));
        CeaserBehaviour c = new CeaserBehaviour();
        System.out.println(c.encode("halloz ", -1));
    }



}
