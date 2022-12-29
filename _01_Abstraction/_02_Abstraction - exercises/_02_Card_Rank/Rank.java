package _01_Abstraction._02_Abstraction_Exercises._02_Card_Rank;

public enum Rank {
    ACE(0), TWO(1), THREE(2), FOUR(3), FIVE(4), SIX(5), SEVEN(6),
    EIGHT(7), NINE(8), TEN(9), JACK(10), QUEEN(11), KING(12);

    private final int rank;

    Rank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return String.format("Ordinal value: %d; Name value: %s",this.rank, name());
    }

    public static void printAll(){
        System.out.println("Card Ranks:");
        for (Rank r : Rank.values()) {
            System.out.println(r);
        }
    }
}
