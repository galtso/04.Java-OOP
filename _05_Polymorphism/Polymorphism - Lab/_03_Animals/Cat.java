package _05_Polymorphism._01_Polymorphism_Lab._03_Animals;

public class Cat extends Animal{
    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        return String.format("I am %s and my favourite food is %s%nMEEOW", super.getName(), super.getFavouriteFood());
    }
}
