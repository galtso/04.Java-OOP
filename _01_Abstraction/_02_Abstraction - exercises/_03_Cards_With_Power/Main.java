package _01_Abstraction._02_Abstraction_Exercises._03_Cards_With_Power;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cardRank = scan.nextLine();
        String cardSuit = scan.nextLine();

        Card card = new Card(Suits.valueOf(cardSuit), Rank.valueOf(cardRank));

        System.out.printf("Card name: %s of %s; Card power: %d", cardRank, cardSuit, card.getPower());
    }
}
