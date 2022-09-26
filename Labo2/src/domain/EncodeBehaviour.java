package domain;

public interface EncodeBehaviour {
    String encode(String text);

    default String decode(String text) {
        return this.encode(text);
    }

}
