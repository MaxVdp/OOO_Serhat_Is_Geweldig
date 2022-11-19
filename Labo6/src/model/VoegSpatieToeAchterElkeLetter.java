package model;

public class VoegSpatieToeAchterElkeLetter extends LetterLezerDecorator {
    boolean vorigKarakterWasEenLetter = false;
    public VoegSpatieToeAchterElkeLetter(LetterLezer letterLezer) {
        this.letterLezer = letterLezer;
    }

    public void setVorigKarakterWasEenLetter(boolean vorigKarakterWasEenLetter) {
        this.vorigKarakterWasEenLetter = vorigKarakterWasEenLetter;
    }

    @Override
    public String leesLetter() {
        String letter = letterLezer.leesLetter();
        return letter + " ";
    }


}
