package domain;

public class Geheimschrift {
    private EncodeBehaviour encodeBehaviour;
    private String geheimschrift;

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

    public void setGeheimschrift(String geheimschrift) {
        if (geheimschrift == null) throw new IllegalArgumentException("invalid string");
        this.geheimschrift = geheimschrift;
    }

    public String encode() {
        return this.encodeBehaviour.encode(geheimschrift);
    }

    public String decode() {
        return this.encodeBehaviour.decode(geheimschrift);
    }

}
