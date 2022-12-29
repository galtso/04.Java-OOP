package _01_Abstraction._01_Abstraction_lab._04_Hotel_Reservation;

public enum DiscountType {
    None(0),
    SecondVisit(10),
    VIP(20);

    private int discountPercent;

    DiscountType(int discountPercent) {
        this.discountPercent = discountPercent;
    }

    public int getDiscountPercent() {
        return discountPercent;
    }
}
