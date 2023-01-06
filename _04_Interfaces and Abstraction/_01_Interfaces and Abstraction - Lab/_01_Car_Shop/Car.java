package _04_Interfaces_And_Abstraction._01_Interfaces_And_Abstraction_Lab._01_Car_Shop;

import java.io.Serializable;

public interface Car extends Serializable {
    int TIRES = 4;
    String getModel();
    String getColor();
    Integer getHorsePower();
    String countryProduced();
}
