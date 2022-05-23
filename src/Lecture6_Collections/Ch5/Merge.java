package Lecture6_Collections.Ch5;

import java.util.*;

public class Merge { // TODO
    public static List<Integer> mergeSorted(List<Integer> l1, List<Integer> l2) {
        Iterator<Integer> it1 = l1.iterator();
        Iterator<Integer> it2 = l2.iterator();
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < l1.size(); i++) {
            for (int j = 0; j < l2.size(); j++) {
                if (l1.get(i)<l2.get(j)) {
                    result.add(it1.next());
                } else {
                    result.add(it2.next());
                }
            }
        }

        return result;

    //        l1.addAll(l2);
//        Collections.sort(l1);
//        return l1;
}

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>(Arrays.asList(1, 2, 4, 9, 10));
        List<Integer> l2 = new ArrayList<>(Arrays.asList(3, 5, 6, 7, 8));

        System.out.println(mergeSorted(l1, l2));

    }
}
