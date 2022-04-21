package Lecture3.Ch2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void displayStrategy(SortingStrategy strategy, Integer[] list) {
        strategy.sort(list);
        for(int i:list)
            System.out.print(i+", ");
        System.out.println(" ");
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 6, 5, 3, 7, 8, 2, 9};
        Integer[] copy1 = Arrays.copyOf(arr, arr.length);
        Integer[] copy2 = Arrays.copyOf(arr, arr.length);
        displayStrategy(new BubbleSort(), copy1);
        displayStrategy(new MergeSort(), copy2);


    }

}
