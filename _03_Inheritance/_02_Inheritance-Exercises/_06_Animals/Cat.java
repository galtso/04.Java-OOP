package _03_Inheritance._02_Inheritance_Exercises._06_Animals;

public class Cat extends Animal{
    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }

    @Override
    public String produceSound() {
        return"Meow meow";
    }
}
