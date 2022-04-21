package Lecture3.Ch4;

public class Student implements Observer {
    public String name;

    public Student(String name) {
        this.name = name;
    }

    public void listenTo(Teacher teacher) {
        teacher.register(this);
    }

    @Override
    public void update(String message) {
        System.out.println(this.name + " learned about " + message);
    }
}
