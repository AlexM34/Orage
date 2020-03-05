import java.util.List;

public class Hand {
    private final List<Card> cards;
    private final Strength strength;

    Hand(final List<Card> cards) {
        this.cards = cards;
        this.strength = calculateStrength(cards);
    }

    private Strength calculateStrength(final List<Card> cards) {
        return null;
    }

    List<Card> getCards() {
        return cards;
    }

    Strength getStrength() {
        return strength;
    }
}
