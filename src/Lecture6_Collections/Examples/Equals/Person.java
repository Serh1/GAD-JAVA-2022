package Lecture6_Collections.Examples.Equals;

public class Person {
    private String name;

    Person(String name){
        this.name = name;
    }
    @Override
    public boolean equals(Object o){
        if(!(o instanceof Person)) return false;
        Person p = (Person) o;
        return p.name.equals(((Person)o).name);
    }
    public static void main(String[] args) {
        Person p1 = new Person("Ion");
        Student s1 = new Student("U1","Sergiu");
        Object o = new Object();

        System.out.println(p1.equals(o));
        System.out.println(s1.equals(p1));
    }
}
