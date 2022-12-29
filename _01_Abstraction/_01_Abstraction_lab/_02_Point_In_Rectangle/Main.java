package _01_Abstraction._01_Abstraction_lab._02_Point_In_Rectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] rectangleCoordinates = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int xBottomLeft = rectangleCoordinates[0];
        int yBottomLeft = rectangleCoordinates[1];
        int xTopRight = rectangleCoordinates[2];
        int yTopRight = rectangleCoordinates[3];
        Point bottomLeft = new Point(xBottomLeft, yBottomLeft);
        Point topRight = new Point(xTopRight, yTopRight);
        Rectangle rectangle = new Rectangle(bottomLeft, topRight);
        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            int[] pointCoordinates = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int pointX = pointCoordinates[0];
            int pointY = pointCoordinates[1];
            Point newPoint = new Point(pointX, pointY);

            System.out.println(rectangle.contains(newPoint));
        }
    }
}
