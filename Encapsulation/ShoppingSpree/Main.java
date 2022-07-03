package ShoppingSpree;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] names = scan.nextLine().split(";");
        String command = scan.nextLine();
        while (!command.equals("END")){

            command = scan.nextLine();
        }
    }
}
