package Lecture3_DesignPatterns.Theory.Anonim;

public class Main {
    public static void main(String[] args) {
        Car car = new Audi();
        car.drive(new Engine());
        car.drive(new Engine() {
            @Override
            public void drive() {
                System.out.println("Driving faster!");
            }
        });
        Car carM = new Merc();
        carM.drive(new Engine());
        carM.drive(new Engine() {
            @Override
            public void drive() {
                System.out.println("Driving faster!");
            }
        });


    }
}
