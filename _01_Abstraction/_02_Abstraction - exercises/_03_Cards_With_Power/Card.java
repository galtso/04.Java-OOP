package _01_Abstraction._02_Abstraction_Exercises._03_Cards_With_Power;



public class Card {
    private Suits cardSuit;
    private Rank cardRank;
    private int power;

    public Card(Suits cardSuit, Rank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    public Suits getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(Suits cardSuit) {
        this.cardSuit = cardSuit;
    }

    public Rank getCardRank() {
        return cardRank;
    }

    public void setCardRank(Rank cardRank) {
        this.cardRank = cardRank;
    }

    public int getPower() {
        return this.cardSuit.getSuitPower() + this.cardRank.getPowerRank();
    }

    public void setPower(int power) {
        this.power = power;
    }
}
