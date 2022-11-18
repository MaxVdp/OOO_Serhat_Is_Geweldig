package domain;

import java.util.Arrays;

public class RandomEncodeAdapter implements EncodeBehaviour {
    private RandomCypher cypher = new RandomCypher();
    @Override
    public String encode(String text) {
        return new String(this.cypher.encypher(text.toCharArray()));
    }

    @Override
    public String decode(String text) {
        return Arrays.toString(this.cypher.decypher(text.toCharArray()));
    }
}
