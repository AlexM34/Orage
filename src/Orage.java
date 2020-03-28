import java.util.Random;

public class Orage {
    public static void main(final String[] args) {
        final int number = new Random().nextInt(52);

        final Card card = transform(number);
        System.out.println(card.getCard());
    }

    private static Card transform(final int number) {
        final int suit = number / 13;
        final int rank = number % 13 + 1;
        return new Card(Rank.getValue(rank) + Suit.getValue(suit));
    }
}
