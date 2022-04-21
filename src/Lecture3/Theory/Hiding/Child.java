package Lecture3.Theory.Hiding;

public class Child extends Parent{
    public String field = " Child 11";
    public static void m(){
        Parent.m();
        System.out.println("Child m");
    };
    public void printFields(){
        System.out.println("Child field " + field + ", parent field " + super.field);
    }

}
