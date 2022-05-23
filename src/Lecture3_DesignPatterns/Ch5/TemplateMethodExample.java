package Lecture3_DesignPatterns.Ch5;

import java.util.Arrays;

public class TemplateMethodExample {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,6,3,8,4,9,2,5,7};
        Integer[] copy1 = Arrays.copyOf(arr, arr.length);
        Integer[] copy2 = Arrays.copyOf(arr, arr.length);

        AscBubbleSort asc = new AscBubbleSort();
        asc.sort(copy1);
        DescBubbleSort desc = new DescBubbleSort();
        desc.sort(copy2);
        displaySorted(copy1);
        displaySorted(copy2);
    }

    public static void displaySorted(Integer[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print(" ");
    }
}
