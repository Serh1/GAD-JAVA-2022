package Lecture5.Ch2;

public class Running implements Shoe {
    private String color;
    private int size;
    public Running(String color,int size){
        this.color = color;
        this.size = size;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Running{" +
                "color='" + color + '\'' +
                ", size=" + size +
                '}';
    }
}
