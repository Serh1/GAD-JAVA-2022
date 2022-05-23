package Lecture3_DesignPatterns.Ch3;

public class Student {
    public String name;
    public int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
