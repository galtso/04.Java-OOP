package _02_Encapsulation._02_Encapsulation_Exercise._03_Shopping_Spree;

public class Product {
    private String name;
    private double cost;

    public Product(String name, double cost) {
        setName(name);
        setCost(cost);
    }

    public String getName() {
        return name;
    }

    private void setName(String name) {
        if (name.length() > 0 && !name.contains(" ")){
            this.name = name;
        }else {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    public double getCost() {
        return cost;
    }

    private void setCost(double cost) {
        if (cost >= 0) {
            this.cost = cost;
        }else throw new IllegalArgumentException("Cost cannot be negative");
    }
}
