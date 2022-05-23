package Lecture6_Collections.Examples;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void ex1(){
//        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(4);
        list.add(8);
        list.add(10);

        Iterator<Integer> iterator = list.iterator();
        Integer current;
        while (iterator.hasNext()){
            current = iterator.next();
            System.out.println(current);
            if(current.equals(2)){
                iterator.remove();
                System.out.println(list.toString());
            }
        }
    }
    public static void main(String[] args) {
        ex1();
    }
}
