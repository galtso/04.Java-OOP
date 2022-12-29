package _01_Abstraction._02_Abstraction_Exercises._01_Card_Suit;

public enum Suits {
    CLUBS("CLUBS", 0),
    DIAMONDS("DIAMONDS", 1),
    HEARTS("HEARTS", 2),
    SPADES("SPADES", 3);

    private String name;
    private int value;

    Suits(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Ordinal value: %d; Name value: %s", this.value, this.name);
    }

    public static void printAll(){
        System.out.println("Card Suits:");
        for (Suits suits : Suits.values()) {
            System.out.println(suits);
        }
    }
}
