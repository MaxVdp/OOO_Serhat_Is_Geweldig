package domain;

import java.util.Arrays;
import java.util.List;

public class CeaserBehaviour implements EncodeBehaviour{
    private String tekst;
    private int defaultVerplaatsing = 5;
    static String[] ap = ("abcdefghijklmnopqrstuvwxyz").split("");
    static List<String> alphabet = Arrays.asList(ap);

    public String encode(String tekst){
        String[] letters = tekst.split("");
        String result = "";
        for(String letter: letters){
            if(letter.equals(" ")){
                result += " ";
            }
            else{
                int index = alphabet.indexOf(letter.toLowerCase());
                if(index + defaultVerplaatsing > 25){
                    index -= 25 + defaultVerplaatsing;
                    result += alphabet.get(index);
                }
                else{
                    index += defaultVerplaatsing;
                    result += alphabet.get(index);
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
    }
}
