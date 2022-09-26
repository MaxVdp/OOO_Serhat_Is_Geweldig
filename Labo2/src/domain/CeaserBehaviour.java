package domain;

public class CeaserBehaviour implements EncodeBehaviour{
    private String tekst;
    private int defaultVerplaatsing = 5;
    static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public String encode(String tekst, int verplaatsing){
<<<<<<< HEAD
        String result = "";
        for(int j = 0; j < tekst.length(); j++){
            for(int i = 0; i<=25; i++){
                if (tekst.charAt(j).equals(" ")) {
                    result += " ";
                }
                else if(tekst.charAt(j) == (alphabet.charAt(i))){
                    if (i+verplaatsing > 25) {
                        result += alphabet.charAt(i+verplaatsing-25);
                    } else {
                        result += alphabet.charAt(i + verplaatsing);
                    }

                }
            }
        }
        return result;
=======
        return null;
>>>>>>> 8943b5e9f90ccc9cdd1b374f8d7dfe966e3b2f5b
    }
    public String decode(String tekst, int verplaatsing){
        return null;
    }
    public String encode(String tekst){
        return null;
    }
    public String decode(String tekst){
        return null;
    }
}
