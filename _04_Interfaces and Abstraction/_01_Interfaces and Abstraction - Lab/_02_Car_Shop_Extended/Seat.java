package _04_Interfaces_And_Abstraction._01_Interfaces_And_Abstraction_Lab._02_Car_Shop_Extended;

public class Seat extends CarImpl implements Sellable {
    private Double price;

    public Seat(String model, String color, Integer horsePower, String countryProduced, Double price) {
        super(model, color, horsePower, countryProduced);
        this.price = price;
    }

    @Override
    public Double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return String.format("%s%n%s sells for %f", super.toString(), super.getModel(), price);
    }
}
