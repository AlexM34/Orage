public class Card {
    private final Rank rank;
    private final Suit suit;

    Card(final String string) {
        this.rank = Rank.transform(string.substring(0, string.length() - 1));
        this.suit = Suit.transform(string.charAt(string.length() - 1));
    }

    Rank getRank() {
        return rank;
    }

    Suit getSuit() {
        return suit;
    }
}
