package Lecture3_DesignPatterns.Theory.Anonim;

public class Merc extends Car{

    @Override
    public void start() {
        System.out.println("Merc start!");
    }

    @Override
    public void stop() {
        System.out.println("Merc stop!");
    }
}
