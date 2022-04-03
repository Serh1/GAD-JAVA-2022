package Lecture2.Ch3;

public class Fish extends Animal implements Pet{

    Fish(){
        super(0);
    }

    @Override
    public void eat() {
        System.out.println("Fish is eating!");
    }

    @Override
    public void walk() {
        System.out.println("Fish can't walk and has no legs!");
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void setName(String name) {

    }

    @Override
    public void play() {

    }
}
