package _02_Encapsulation._01_Encapsulation_Lab._03_Validation_Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());

        List<Person> people = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = scan.nextLine().split(" ");
            people.add(new Person(input[0], input[1], Integer.parseInt(input[2]),Double.parseDouble(input[3])));
        }
        for (Person person : people) {
            System.out.println(person);
        }
    }
}
