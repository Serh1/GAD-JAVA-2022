package Lecture2.Ch3;

public class TestAnimals {
    public static void main(String[] args) {
        Fish fish = new Fish();
        Cat cat = new Cat();
        Animal a = new Fish();
        Animal e = new Spider();
        Pet p = new Cat();

        // a.
//        fish.eat();fish.walk();
//        System.out.println(" ");
//        cat.eat();cat.walk();
//        System.out.println(" ");
//        a.eat(); a.walk();
//        System.out.println(" ");
//        e.eat();e.walk();

        //b.
        (fish).walk();
        a.eat();
        a = (cat); // a becomes cat instead of fish
        a.eat();

        //c.
        a.walk();
        Animal animal = new Fish() {
            @Override
            public void eat() {
                System.out.println("Animal eats vegan with nr of legs:" + legs);
            }

            @Override
            public void walk() {
                super.walk();
            }
        };
        animal.walk();
        animal.eat();



    }



}
