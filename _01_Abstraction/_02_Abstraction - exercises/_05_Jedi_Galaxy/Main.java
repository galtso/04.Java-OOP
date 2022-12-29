package _01_Abstraction._02_Abstraction_Exercises._05_Jedi_Galaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] dimensions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int rows = dimensions[0];
        int cols = dimensions[1];

        int[][] matrix = new int[rows][cols];

        int value = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = value++;
            }
        }

        String command = scanner.nextLine();
        long sum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] peterCoordinates = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int peterRow = peterCoordinates[0];
            int peterCol = peterCoordinates[1];

            int[] evilCoordinates = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int evilRow = evilCoordinates[0];
            int evilCol = evilCoordinates[1];

            evilMovement(matrix, evilRow, evilCol);


            sum = peterMovement(matrix, sum, peterRow, peterCol);
            command = scanner.nextLine();
        }
        System.out.println(sum);
    }

    private static long peterMovement(int[][] matrix, long sum, int peterRow, int peterCol) {
        while (peterRow >= 0 && peterCol < matrix[1].length) {
            if (peterRow < matrix.length && peterCol >= 0 && peterCol < matrix[0].length) {
                sum += matrix[peterRow][peterCol];
            }
            peterCol++;
            peterRow--;
        }
        return sum;
    }

    private static void evilMovement(int[][] matrix, int evilRow, int evilCol) {
        while (evilRow >= 0 && evilCol >= 0) {
            if (evilRow < matrix.length && evilCol < matrix[0].length) {
                matrix[evilRow][evilCol] = 0;
            }
            evilRow--;
            evilCol--;
        }
    }
}
