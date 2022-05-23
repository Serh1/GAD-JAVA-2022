package Lecture3_DesignPatterns.Theory.Anonim;

public abstract class Car {
    public abstract void start();
    public abstract void stop();

    public void drive(Engine engine){
        start();
        engine.drive();
        stop();
    }

}
