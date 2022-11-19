package model;

public class GeefEersteLetterEenHoofdletter extends LetterLezerDecorator {
    boolean vorigeLetterWasEenSpatie = true;

    public GeefEersteLetterEenHoofdletter(LetterLezer letterLezer) {
        this.letterLezer = letterLezer;
    }

    @Override
    public String leesLetter() {
        String letter = letterLezer.leesLetter();
        if (letter.equals(" ")) {
            this.setVorigeLetterWasEenSpatie(true);
            return " ";
        }
        boolean moetUppercaseZijn = this.vorigeLetterWasEenSpatie;
        this.setVorigeLetterWasEenSpatie(false);
        return moetUppercaseZijn ? letter.toUpperCase() : letter;
    }

    public void setVorigeLetterWasEenSpatie(boolean vorigeLetterWasEenSpatie) {
        this.vorigeLetterWasEenSpatie = vorigeLetterWasEenSpatie;
    }
}
