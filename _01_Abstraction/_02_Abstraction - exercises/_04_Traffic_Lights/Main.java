package _01_Abstraction._02_Abstraction_Exercises._04_Traffic_Lights;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] colors = scan.nextLine().split(" ");
        int changes = Integer.parseInt(scan.nextLine());

        List<Light> trafficLight = new ArrayList<>();
        for (String color : colors) {
            Light light = new Light(Color.valueOf(color));
            trafficLight.add(light);
        }
        for (int i = 0; i < changes; i++) {
            trafficLight.forEach(light -> {
                light.changeColor();
                System.out.print(light.getColor() + " ");
            });
            System.out.println();
        }
    }
}
