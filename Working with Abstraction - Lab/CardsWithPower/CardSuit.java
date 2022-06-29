package CardsWithPower;

public enum CardSuit {
    CLUBS(0), DIAMONDS(13), HEARTS(26), SPADES(39);

    private int suitRank;

    CardSuit(int suitRank) {
        this.suitRank = suitRank;
    }

    public int getSuitRank() {
        return suitRank;
    }
}
