package domain;

import java.util.Arrays;
import java.util.List;

public class CeaserBehaviour implements EncodeBehaviour {
    private static String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private int verplaatsing = 5;

    public String decode(String tekst) {
        String newString = "";
        for (String c : tekst.split("")) {
            if (c.equals(" ")) {
                newString += c;
            } else {
                int index = ALPHABET.indexOf(c.toLowerCase());
                int newIndex = index - verplaatsing;
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

    public String encode(String tekst) {
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

}
