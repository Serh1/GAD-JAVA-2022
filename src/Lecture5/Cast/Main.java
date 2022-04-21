package Lecture5.Cast;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class Main {

//    public  static double sum(List<? extends Number> list){
//        //list.add(3.4);
//        return list.get(0).doubleValue();
//    }

    public  static Object sum(List<Object> list){
        list.add(3.4);
        return list.get(0);
    }

    public static void main(String[] args) {
        List strings = new ArrayList();
        strings.add("Sergiu");
        strings.add(new Date());

        for (Object o : strings) {
            try {
                String s = (String) o;
                System.out.println(s);
            }catch (ClassCastException e){
                System.out.println("Exception");
            }
        }

        List<String> string2 = new ArrayList<String>();
        string2.add("ex");
        for(String s : string2){
            System.out.println(s.toLowerCase());
        }


    }

    public <T> int m(T[] mArray, T elem){


        return 1;
    }
}
