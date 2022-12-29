package _01_Abstraction._02_Abstraction_Exercises._03_Cards_With_Power;

public enum Suits {
    CLUBS(0),
    DIAMONDS(13),
    HEARTS(26),
    SPADES(39);

    private int suitPower;

    Suits(int suitPower) {
        this.suitPower = suitPower;
    }

    public int getSuitPower() {
        return suitPower;
    }
}
