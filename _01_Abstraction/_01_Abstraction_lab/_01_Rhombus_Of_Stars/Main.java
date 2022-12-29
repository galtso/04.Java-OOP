package _01_Abstraction._01_Abstraction_lab._01_Rhombus_Of_Stars;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = Integer.parseInt(scan.nextLine());

        printTopHalf(size);

        printBottomHalf(size);
    }

    private static void printBottomHalf(int size) {
        for (int starCount = size - 1; starCount > 0; starCount--) {
            printRow(size, starCount);
        }
    }

    private static void printTopHalf(int size) {
        for (int starCount = 1; starCount <= size; starCount++) {
            printRow(size, starCount);
        }
    }

    private static void printRow(int size, int starCount) {
        for (int i = 0; i < size - starCount; i++) {
            System.out.print(" ");
        }
        for (int i = 0; i < starCount - 1; i++) {
            System.out.print("* ");
        }
        System.out.println("*");
    }
}
