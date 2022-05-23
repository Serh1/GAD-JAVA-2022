package Lecture8_Functional.Examples;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Streams {
    public static void ex1() {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 6, 7, 8));
        List<Integer> numbers = IntStream.range(0,11)
                .boxed()
                .map(current -> current.getClass().getName())
                .map(current -> {
                    System.out.println(current);
                    return current.length();
                })
                .collect(Collectors.toList());
        System.out.println(numbers);

    }

    public static void ex2(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 6, 7, 8));
        Integer max = list.stream().reduce((x,y) -> x>y?x:y)
                .get();
        System.out.println(max);
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 6, 7, 8));
//        Integer sum = list.stream().reduce(0,(x,y)-> x+y));
//        System.out.println(sum);
    }


}
