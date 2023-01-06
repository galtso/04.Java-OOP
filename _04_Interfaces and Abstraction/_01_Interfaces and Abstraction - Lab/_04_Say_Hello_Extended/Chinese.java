package _04_Interfaces_And_Abstraction._01_Interfaces_And_Abstraction_Lab._04_Say_Hello_Extended;

public class Chinese extends BasePerson {
    public Chinese(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Djydjybydjy";
    }
}
