public enum Strength {
    HIGH_CARD(0), PAIR(1), TWO_PAIRS(2), SET(3), STRAIGHT(4), FLUSH(5),
    FULL_HOUSE(6), QUADS(7), STRAIGHT_FLUSH(8), ROYAL(9);

    private int rank;

    Strength(final int rank) {
        this.rank = rank;
    }
}
