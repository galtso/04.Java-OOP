package CardsWithPower;

public class Card {
    //взимаме боята от енъма за боите
    private CardSuit cardSuit;
    //взимаме стойността от Card Rank enum
    private CardRank cardRank;
    //сила = боя + стойност
    private int power;

    public Card(CardSuit cardSuit, CardRank cardRank) {
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    public CardSuit getCardSuit() {
        return cardSuit;
    }

    public void setCardSuit(CardSuit cardSuit) {
        this.cardSuit = cardSuit;
    }

    public CardRank getCardRank() {
        return cardRank;
    }

    public void setCardRank(CardRank cardRank) {
        this.cardRank = cardRank;
    }

    public int getPower() {
        // power = suitPower + rankPower
        return this.cardSuit.getSuitRank() + this.cardRank.getPowerRank();
    }

    public void setPower(int power) {
        this.power = power;
    }
}
