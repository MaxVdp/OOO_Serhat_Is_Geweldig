package model;

public class FileLetterLezerLauncher {
    public static void main(String[] args) {
        LetterLezer fl = new VoegSpatieToeAchterElkeLetter(new VerwijderSpaties(new GeefEersteLetterEenHoofdletter(new TekstLetterLezer("letters.txt dit was een zin met spaties."))));
        String letter = fl.leesLetter();
        while (!letter.equals("*") && !letter.equals("* ")) {
            System.out.print(letter);
            letter = fl.leesLetter();
        }
    }
}