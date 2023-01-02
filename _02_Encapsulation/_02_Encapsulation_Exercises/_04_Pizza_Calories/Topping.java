package _02_Encapsulation._02_Encapsulation_Exercise._04_Pizza_Calories;

import java.util.Set;

public class Topping {
    private String type;
    private double weight;

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    private void setToppingType(String toppingType) {
        Set<String> types = Set.of("Meat", "Veggies", "Cheese", "Sauce");
        if (types.contains(toppingType)) {
            this.type = toppingType;
        } else {
            throw new IllegalArgumentException("Cannot place " + toppingType + " on top of your pizza.");
        }
    }

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 50) {
            this.weight = weight;
        } else {
            throw new IllegalArgumentException(type + " weight should be in the range [1..50].");
        }
    }

    public double calculateCalories() {
        double modifier = 1;
        switch (type) {
            case "Meat":
                modifier = 1.2;
                break;
            case "Veggies":
                modifier = 0.8;
                break;
            case "Cheese":
                modifier = 1.1;
                break;
            case "Sauce":
                modifier = 0.9;
                break;
        }
        return weight * 2 * modifier;
    }
}
