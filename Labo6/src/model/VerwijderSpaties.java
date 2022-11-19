package model;

public class VerwijderSpaties extends LetterLezerDecorator {

    public VerwijderSpaties(LetterLezer letterLezer) {
        this.letterLezer = letterLezer;
    }

    @Override
    public String leesLetter() {
        String letter = letterLezer.leesLetter();
        return (letter == " "? "" : letter);
    }
}
