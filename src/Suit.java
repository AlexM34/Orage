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

    static String getValue(final int position) {
        switch (position) {
            case 0: return "s";
            case 1: return "h";
            case 2: return "d";
            case 3: return "c";
            default: throw new IllegalArgumentException("Illegal suit position passed!");
        }
    }

    static Suit transform(final char suit) {
        return Arrays.stream(values()).filter(s -> s.getSuit() == suit).findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
