package _02_Encapsulation._02_Encapsulation_Exercise._03_Shopping_Spree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        products = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 0 && !name.contains(" ")) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty");
        }
    }

    public void setMoney(double money) {
        if (money > 0) {
            this.money = money;
        } else throw new IllegalArgumentException("Money cannot be negative");
    }

    public void buyProduct(Product product) {
        if (money >= product.getCost()) {
            products.add(product);
            money -= product.getCost();
        }else {
            String message = String.format("%s can't afford %s",getName(),product.getName());
            throw new IllegalArgumentException(message);
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(name).append(" - ");
        if (products.isEmpty()) {
            sb.append("Nothing bought");
        } else {
            sb.append(products.stream().map(Product::getName).collect(Collectors.joining(", ")));
        }
        return sb.toString();
    }
}
