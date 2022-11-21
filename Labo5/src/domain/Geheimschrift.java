package domain;

import factory.EncodeBehaviourFactory;

public class Geheimschrift {
    private EncodeBehaviour encodeBehaviour;
    private String tekst;

    public Geheimschrift() {}

    public void setEncodeBehaviour(String encodeBehaviour, Object... args) {
        this.encodeBehaviour = EncodeBehaviourFactory.createEncodeBehaviour(encodeBehaviour, args);
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

    public EncodeBehaviour getEncodeBehaviour() {
        return encodeBehaviour;
    }
}
