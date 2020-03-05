import java.util.Arrays;

public enum Rank {
    Ace(1, "A"), Two(2, "2"), Three(3, "3"), Four(4, "4"),
    Five(5, "5"), Six(6, "6"), Seven(7, "7"), Eight(8, "8"),
    Nine(9, "9"), Ten(10, "10"), Jack(11, "J"),
    Queen(12, "Q"), King(13, "K");

    private final int position;
    private final String value;

    Rank(final int position, final String value) {
        this.position = position;
        this.value = value;
    }

    int getPosition() {
        return position;
    }

    String getValue() {
        return value;
    }

    static Rank transform(final String rank) {
        return Arrays.stream(values()).filter(r -> r.getValue().equals(rank)).findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
