public class Showdown {
    static int compare(final String first, final String second) {
        final Hand firstHand = pickHand(first);
        final Hand secondHand = pickHand(second);

        return compare(firstHand, secondHand);
    }

    private static Hand pickHand(final String first) {
        return null;
    }

    private static int compare(final Hand firstHand, final Hand secondHand) {
        return 50;
    }
}
