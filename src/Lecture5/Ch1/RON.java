package Lecture5.Ch1;

public class RON extends Currency{
    public RON(double value) {
        super(value);
    }

    @Override
    public String toString() {
        return "RON "+ getValue();
    }
}
