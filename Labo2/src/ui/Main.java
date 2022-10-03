package ui;

import domain.CeaserBehaviour;
import domain.EncodeBehaviour;
import domain.Geheimschrift;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        CeaserBehaviour c = new CeaserBehaviour();
        System.out.println(c.encode("halloz ", -1));
    }



}
