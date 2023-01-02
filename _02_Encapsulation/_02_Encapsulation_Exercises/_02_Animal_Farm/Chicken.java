public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        if (name.length() > 0) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty.");
        }
    }

    public void setAge(int age) {
        if (age >= 0 && age < 15) {
            this.age = age;
        } else {
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
    }

    private double calculateProductPerDay() {
        double productPerDay = 0;
        if (age >= 0 && age <= 5) {
            productPerDay = 2;
        } else if (age >= 6 && age <= 11) {
            productPerDay = 1;
        } else {
            productPerDay = 0.75;
        }
        return productPerDay;
    }

    public double productPerDay(){
        return calculateProductPerDay();
    }

    @Override
    public String toString() {
        return String.format("Chicken %s (age %d) can produce %.2f eggs per day.",this.name, this.age, productPerDay());
    }
}
