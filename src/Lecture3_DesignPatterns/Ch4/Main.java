package Lecture3_DesignPatterns.Ch4;

public class Main {
    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        Student s01 = new Student("Sergiu");
        Student s02 = new Student("Mateiu");
        Student s03 = new Student("Pantof");

        s01.listenTo(teacher);
        s02.listenTo(teacher);
        s03.listenTo(teacher);


        String[] topics = new String[]{"Patterns", "OOP", "Observer"};

        for (String topic : topics) {
            teacher.teach(topic);
        }

    }
}
