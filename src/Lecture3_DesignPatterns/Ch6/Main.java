package Lecture3_DesignPatterns.Ch6;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person.Builder("Sergiu").setJob("Student").build();
        Person person2 = new Person.Builder("Mateiu").setUniversity("UTCN").build();
        Person person3 = new Person.Builder("Pantof").setMarried(true).setDrivingLicencse(true).build();
        Person person4 = new Person.Builder("Grig").setJob("Student").setUniversity("UBB").build();
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);
    }
}
