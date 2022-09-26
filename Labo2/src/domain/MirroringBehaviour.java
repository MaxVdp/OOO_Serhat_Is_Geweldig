package domain;

public class MirroringBehaviour {
    private String tekst;

    private String encode(String tekst){
        String newString = "";
        for(String l : tekst.split("")){
            newString = l + newString;
        }
        return newString;
    }
}
