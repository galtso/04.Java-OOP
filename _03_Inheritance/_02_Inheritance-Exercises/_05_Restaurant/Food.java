package _03_Inheritance._02_Inheritance_Exercises._05_Restaurant;

import java.math.BigDecimal;

public class Food extends Product{
    private double grams;

    public Food(String name, BigDecimal price, double grams) {
        super(name, price);
        this.grams = grams;
    }

    public double getGrams() {
        return grams;
    }
}
