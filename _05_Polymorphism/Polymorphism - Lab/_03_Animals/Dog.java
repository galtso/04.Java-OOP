package _05_Polymorphism._01_Polymorphism_Lab._03_Animals;

public class Dog extends Animal{
    public Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return String.format("I am %s and my favourite food is %s%nDJAAF", super.getName(), super.getFavouriteFood());
    }
}
