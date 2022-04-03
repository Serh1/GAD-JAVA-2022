package Lecture2.Ch3;

public abstract class Animal {
    protected int legs;

    protected Animal(int legs) {
        this.legs = legs;
    }



    public abstract void eat();

    public void walk(){
        System.out.println("Animal walks and have "+this.legs +" legs.");
    }


}
