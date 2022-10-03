package domain;

import java.util.Arrays;
import java.util.List;

public class CeaserBehaviour implements EncodeBehaviour {
    private int defaultVerplaatsing = 5;
    private static String ALPHABET = "abcdefghijklmnopqrstuvwxyz";

    public String decode(String tekst, int verplaatsing) {
        return this.encode(tekst, -verplaatsing);
    }

    public String encode(String tekst, int verplaatsing) {
        String newString = "";
        for (String c : tekst.split("")) {
            if (c.equals(" ")) {
                newString += c;
            } else {
                int index = ALPHABET.indexOf(c.toLowerCase());
                int newIndex = index + verplaatsing;
                newIndex = ((newIndex % 26) + 26) % 26;
                String newChar = ALPHABET.substring(newIndex, newIndex + 1);
                if (c.equals(c.toLowerCase())) {
                    newString += newChar;
                } else {
                    newString += newChar.toUpperCase();
                }
            }
        }
        return newString;
    }

    @Override
    public String encode(String text) {
        return this.encode(text, defaultVerplaatsing);
    }

    @Override
    public String decode(String text) {
        return this.decode(text, -defaultVerplaatsing);
    }
}
