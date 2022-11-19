package model;

public class TekstLetterLezer extends LetterLezer {
    private String tekst;
    private int index = 0;

    public TekstLetterLezer(String tekst){
        this.tekst = tekst;
    }

    public String leesLetter(){
        if (index < tekst.length()){
            index++;
            return tekst.substring(index - 1, index);
        }
        return "*";
    }
}