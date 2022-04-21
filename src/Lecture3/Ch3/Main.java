package Lecture3.Ch3;

public class Main {
    public static void main(String[] args) {
        Apartment ap01 = new Apartment("Obs10",200);
        Apartment ap02 = new Apartment("Marasti10",300);
        Apartment ap03 = new Apartment("Manastur10",400);
        Apartment ap04 = new Apartment("Baritiu10",500);

        RealEstateAgentProxy proxy = new RealEstateAgentProxy();
        proxy.represent(ap01);
        proxy.represent(ap02);
        proxy.represent(ap03);
        proxy.represent(ap04);

        Student student01 = new Student("Sergiu",300);
        Student student02 = new Student("Pantof",400);

        Apartment apartment1 = proxy.rent(student01);
        System.out.println(student01 + " rented " + apartment1);
        Apartment apartment2 = proxy.rent(student02);
        System.out.println(student02 + " rented " + apartment2);



    }
}
