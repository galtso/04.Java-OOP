package _01_Abstraction._01_Abstraction_lab._04_Hotel_Reservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] holidayInfo = scan.nextLine().split(" ");
        double pricePerDay = Double.parseDouble(holidayInfo[0]);
        int numberOfDays = Integer.parseInt(holidayInfo[1]);
        Season season = Season.valueOf(holidayInfo[2]);
        DiscountType discount = DiscountType.valueOf(holidayInfo[3]);

        double price = PriceCalculator.calculatePrice(pricePerDay, numberOfDays, season, discount);
        System.out.printf("%.2f", price);
    }
}
