package Lecture5_Generics.Ch1;

public abstract class Currency {
    private double value;
    public Currency(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }
}
