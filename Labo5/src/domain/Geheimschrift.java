package domain;

public class Geheimschrift {
    private EncodeBehaviour encodeBehaviour;
    private String tekst;

    public Geheimschrift(String geheimschrift, EncodeBehaviour encodeBehaviour) {
        setGeheimschrift(geheimschrift);
        setEncodeBehaviour(encodeBehaviour);
    }

    public Geheimschrift(String geheimschrift) {
        this(geheimschrift, null);
    }

    public Geheimschrift() {}

    public void setEncodeBehaviour(EncodeBehaviour encodeBehaviour) {
        this.encodeBehaviour = encodeBehaviour;
    }

    public void setGeheimschrift(String tekst) {
        if (tekst == null) throw new IllegalArgumentException("invalid string");
        this.tekst = tekst;
    }

    public String encode() {
        return this.encodeBehaviour.encode(tekst);
    }

    public String decode() {
        return this.encodeBehaviour.decode(tekst);
    }

}
