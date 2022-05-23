package Lecture2_OOP.Ch3;

public class Spider extends Animal{
    public Spider(){
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("Spider is eating!");
    }
}
