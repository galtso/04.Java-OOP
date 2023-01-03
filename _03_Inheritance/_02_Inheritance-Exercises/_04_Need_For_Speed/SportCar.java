package _03_Inheritance._02_Inheritance_Exercises._04_Need_For_Speed;

public class SportCar extends Car{
    private static final double DEFAULT_FUEL_CONSUMPTION = 10;

    public SportCar(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
