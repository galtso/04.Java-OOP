package _02_Encapsulation._01_Encapsulation_Lab._02_Salary_Increase;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double percent){
        if (this.age>=30){
            this.salary = this.salary + this.salary * percent / 100;
        }else {
            this.salary = this.salary + this.salary * percent / 200;
        }
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %.1f leva", firstName,lastName,salary);
    }
}
