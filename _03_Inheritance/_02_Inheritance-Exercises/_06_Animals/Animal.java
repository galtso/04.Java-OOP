package _03_Inheritance._02_Inheritance_Exercises._06_Animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setName(name);
        setAge(age);
        setGender(gender);
    }

    private void setName(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid Input");
        } else {
            this.name = name;
        }
    }

    private void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Invalid Input");
        } else {
            this.age = age;
        }
    }

    private void setGender(String gender) {
        if (gender == null || gender.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid Input");
        } else {
            this.gender = gender;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String produceSound() {
        return "";
    }

    @Override
    public String toString() {
        return String.format("%s%n%s %d %s%n%s",
                this.getClass().getSimpleName(), this.name, this.age, this.gender,produceSound());
    }
}
