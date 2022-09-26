package domain;

public class MirroringBehaviour implements EncodeBehaviour {

    public String encode(String tekst){
        String newString = "";
        for(String l : tekst.split("")){
            newString = l + newString;
        }
        return newString;
    }
}
