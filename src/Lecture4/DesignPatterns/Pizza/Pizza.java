package Lecture4.DesignPatterns.Pizza;

public abstract class Pizza {
    public abstract void prepate();

    public void bake() {
        System.out.println("Bake for 25 min at 350 C.");
    }

    public void cut() {
        System.out.println("Cutting pizza.");
    }

    public void box() {
        System.out.println("Place pizza into a box.");
    }

}
