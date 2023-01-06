package _04_Interfaces_And_Abstraction._01_Interfaces_And_Abstraction_Lab._04_Say_Hello_Extended;

public abstract class BasePerson implements Person{
    private String name;

    public BasePerson(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
