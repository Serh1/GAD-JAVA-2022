package Lecture6.Examples.Maps;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<Long,String> persons = new HashMap<>();
        persons.put(2312412L,"Mateiu Sergiu");
        persons.put(5134124L,"Mateiu Emil");
        persons.put(5134124L,"Sergiu Emil");

        System.out.println(persons.get(4123212L));

        for(Map.Entry person:persons.entrySet()){
            System.out.println(person);
        }
    }
}
