package Lecture2_OOP.Ch3;

public class Cat extends Animal implements Pet {
    String name;


    public Cat(String name) {
        super(4);
    }

    Cat() {
        super(4);
        this.name = "";
    }

    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("Cat is playing!");
    }
}
