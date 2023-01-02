package _02_Encapsulation._02_Encapsulation_Exercise._04_Pizza_Calories;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] input1 = scan.nextLine().split("\\s+");
        String pizzaName = input1[1];
        int numberOfToppings = Integer.parseInt(input1[2]);
        Pizza pizza;
        try {
            pizza = new Pizza(pizzaName, numberOfToppings);

            String[] input2 = scan.nextLine().split("\\s+");
            String flour = input2[1];
            String backing = input2[2];
            int doughWeight = Integer.parseInt(input2[3]);
            Dough dough = new Dough(flour, backing, doughWeight);
            pizza.setDough(dough);

            String input3;
            while (!"END".equals(input3 = scan.nextLine())) {
                String[] input = input3.split("\\s+");
                String toppingType = input[1];
                int weight = Integer.parseInt(input[2]);
                Topping topping;
                topping = new Topping(toppingType, weight);
                pizza.addTopping(topping);
            }
            System.out.println(pizza);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
