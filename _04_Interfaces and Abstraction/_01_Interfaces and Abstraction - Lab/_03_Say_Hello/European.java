package _04_Interfaces_And_Abstraction._01_Interfaces_And_Abstraction_Lab._03_Say_Hello;

public class European implements Person{
    private String name;

    public European(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
