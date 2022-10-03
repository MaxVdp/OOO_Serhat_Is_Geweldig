package domain;

public class CeaserBehaviour implements EncodeBehaviour{
    private int defaultVerplaatsing = 5;
    private static String alphabet = "abcdefghijklmnopqrstuvwxyz";


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

    public String encode(String tekst){
        return this.encode(tekst, this.defaultVerplaatsing);
    }
}
