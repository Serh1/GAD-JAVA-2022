package Lecture6.Ch1;

import java.util.*;

public class Leaders {
    public static List<Integer> findLeaders(List<Integer> list) {
        List<Integer> leaders = new ArrayList<>();
        Collections.reverse(list);
        Iterator<Integer> iterator = list.iterator();
        Integer max = list.get(0);
        leaders.add(max);
        Integer current;
        while (iterator.hasNext()) {
            current = iterator.next();
            if (current > max) {
                max = current;
                leaders.add(current);
            }
        }
        return leaders;
    }


    public static void main(String[] args) {
        // 4 6 1 4 7 9 3
        List list = Arrays.asList(1, 4, 2, 5, 1);
        System.out.println(findLeaders(list));

    }
}
