package domain;

public interface EncodeBehaviour {
    String encode();

    default String decode() {
        return this.encode();
    }

}
