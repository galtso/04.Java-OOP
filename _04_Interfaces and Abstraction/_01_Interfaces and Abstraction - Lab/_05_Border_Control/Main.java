package _04_Interfaces_And_Abstraction._01_Interfaces_And_Abstraction_Lab._05_Border_Control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<Identifiable> peopleToEnter = new ArrayList<>();
        String input = scan.nextLine();
        while (!input.equals("End")) {
            String[] inputData = input.split(" ");
            if (inputData.length == 3) {
                peopleToEnter.add(new Citizen(inputData[0], Integer.parseInt(inputData[1]), inputData[2]));
            } else {
                peopleToEnter.add(new Robot(inputData[0], inputData[1]));
            }
            input = scan.nextLine();
        }
        String number = scan.nextLine();
        for (Identifiable identifiable : peopleToEnter) {
            if (identifiable.getId().endsWith(number)) {
                System.out.println(identifiable.getId());
            }
        }
    }
}
