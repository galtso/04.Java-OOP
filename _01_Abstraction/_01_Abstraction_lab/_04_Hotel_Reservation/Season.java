package _01_Abstraction._01_Abstraction_lab._04_Hotel_Reservation;

public enum Season {
    Autumn(1),
    Spring(2),
    Winter(3),
    Summer(4);


    private int multiplication;

    Season(int multiplication) {
        this.multiplication = multiplication;
    }

    public int getMultiplication() {
        return multiplication;
    }
}
