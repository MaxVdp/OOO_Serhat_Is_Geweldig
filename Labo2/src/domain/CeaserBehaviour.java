package domain;

import java.util.Arrays;
import java.util.List;

public class CeaserBehaviour implements EncodeBehaviour {
    private int defaultVerplaatsing = 5;
    private static String alphabet = "abcdefghijklmnopqrstuvwxyz";


    public String encode(String tekst, int verplaatsing) {
        String result = "";
        for (int j = 0; j < tekst.length(); j++) {
            for (int i = 0; i <= 25; i++) {
                if (tekst.charAt(j).equals(" ")) {
                    result += " ";
                } else if (tekst.charAt(j) == (alphabet.charAt(i))) {
                    if (i + verplaatsing > 25) {
                        result += alphabet.charAt(i + verplaatsing - 25);
                    } else {
                        result += alphabet.charAt(i + verplaatsing);
                    }
                }
            }
        }
        return result;
    }
    public String encode(String tekst, int verplaatsing){
        String[] letters = tekst.split("");
        String result = "";
        for(String letter: letters){
            if(letter.equals(" ")){
                result += " ";
            }
            else{
                int index = alphabet.indexOf(letter.toLowerCase());
                if(index + verplaatsing > 25){
                    index -= 25 + verplaatsing;
                    result += alphabet.get(index);
                }
                else if(index + verplaatsing < 0){
                    index += 25 + verplaatsing;
                    result += alphabet.get(index);
                }
                else{
                    index += verplaatsing;
                    result += alphabet.get(index);
                }
            }
        }
        return result;
    }
    public String decode(String tekst){
        return this.encode(tekst, -defaultVerplaatsing);
    }
    public String decode(String tekst, int verplaatsing){
        return this.encode(tekst, -verplaatsing);

    public String encode3(String tekst, int verplaatsing) {
        String alfabet = "abcdefghijklmnopqrstuvwxyz";
        String newString = "";
        for (String c : tekst.split("")) {
            if (c.equals(" ")) {
                newString += c;
            } else {
                int index = alfabet.indexOf(c.toLowerCase());
                int newIndex = index + verplaatsing;
                newIndex = ((newIndex % 26) + 26) % 26;
                String newChar = alfabet.substring(newIndex, newIndex + 1);
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
        return this.encode(tekst, this.defaultVerplaatsing);
    }
}
