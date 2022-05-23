package Lecture8_Functional.Ch1;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {

    }

    @Test
    public void consumer_1(){
        List<String> list = new ArrayList<>(Arrays.asList("a","b","c"));
        Consumer<List<String>> consumer = (n) -> System.out.println(n);
        consumer.accept(list);

        Assert.assertEquals(list,new ArrayList<>(3));
    }
    @Test
    public void consumer_2(){
        List<String> list1 = new ArrayList<>(Arrays.asList("a","b","c"));
        List<String> list2 = new ArrayList<>(Arrays.asList("a","b","c","first","second"));
        Consumer<List<String>> c1  = list -> list.add("first");
        Consumer<List<String>> c2  = list -> list.add("second");

        Consumer<List<String>> consumer = null;
        consumer.accept(list1);

        Assert.assertEquals(list1,list2);
    }
}
