package _01_Abstraction._01_Abstraction_lab._04_Hotel_Reservation;

public class PriceCalculator {

    public static double calculatePrice(double pricePerDay, int numberOfDays, Season season, DiscountType discount) {
        return pricePerDay * numberOfDays * season.getMultiplication() * (1 - discount.getDiscountPercent() / 100.0);
    }
}
