package Lecture6.Ch5;

import java.util.*;

public class Merge {
    public static List<Integer> mergeSorted(List<Integer> l1, List<Integer> l2) {
        l1.addAll(l2);
        Collections.sort(l1);
        return l1;
    }

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 4));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(3, 5, 6, 7, 8));

        System.out.println(mergeSorted(l1, l2));

    }
}
