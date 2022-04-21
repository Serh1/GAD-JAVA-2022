package Lecture5.Ch1;

public abstract class Currency {
    private double value;
    public Currency(double value) {
        this.value = value;
    }
    public double getValue() {
        return value;
    }
}
