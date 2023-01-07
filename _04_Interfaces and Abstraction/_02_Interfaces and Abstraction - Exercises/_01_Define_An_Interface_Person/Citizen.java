package _04_Interfaces_And_Abstraction._02_Interfaces_And_Abstraction_Exercises._01_Define_An_Interface_Person;

public class Citizen implements Person{
    private String name;
    private int age;

    public Citizen(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }
}
