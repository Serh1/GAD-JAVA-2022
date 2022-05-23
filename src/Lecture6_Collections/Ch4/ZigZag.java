package Lecture6_Collections.Ch4;

import java.util.Arrays;
import java.util.List;

public class ZigZag {
    private List<Integer> list;

    public ZigZag(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> arrangeList() {
        int temp, temp1;
        for (int i = 0; i < list.size() - 1; i++) {
            if (i % 2 == 0 && list.get(i) > list.get(i + 1)) {
                temp = list.get(i);
                temp1 = list.get(i + 1);
                list.set(i, temp1);
                list.set(i + 1, temp);
            } else if (i % 2 == 1 && list.get(i) < list.get(i + 1)) {
                temp = list.get(i);
                temp1 = list.get(i + 1);
                list.set(i, temp1);
                list.set(i + 1, temp);
            }

        }
        return this.list;
    }

    @Override
    public String toString() {
        return "ZigZag{" +
                "list=" + list +
                '}';
    }

    public static void main(String[] args) {
        ZigZag zigZag = new ZigZag(Arrays.asList(5,2,7,4,1,2));
        ZigZag zigZag1 = new ZigZag(Arrays.asList(4, 3, 7, 8, 6, 2, 1));
        System.out.println(zigZag.arrangeList());
        System.out.println( zigZag1.arrangeList());
    }
}
