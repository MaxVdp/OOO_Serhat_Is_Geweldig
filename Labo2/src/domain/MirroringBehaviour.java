package domain;

public class MirroringBehaviour implements EncodeBehaviour {

    public String encode(String tekst){
        String newString = "";
        for(String l : tekst.split("")){
            newString = l + newString;
        }
        return newString;
    }

    public static String encodeRecursive(String text) {
        if (text == null) throw new IllegalArgumentException("invalid string");
        if (text.length() == 1) return text;

        String first = text.substring(0, 1);
        String rest = text.substring(1);
        return encodeRecursive( rest) + first;
    }
}
