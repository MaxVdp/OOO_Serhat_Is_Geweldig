package domain;

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
