import java.util.Arrays;

public enum Suit {
    SPADE('s'), HEART('h'), DIAMOND('d'), CLUB('c');

    private char suit;

    Suit(final char suit) {
        this.suit = suit;
    }

    char getSuit() {
        return suit;
    }

    static Suit transform(final char suit) {
        return Arrays.stream(values()).filter(s -> s.getSuit() == suit).findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
