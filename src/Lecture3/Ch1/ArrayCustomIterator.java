package Lecture3.Ch1;

public class ArrayCustomIterator implements MyIterator {
    private int[] arr;
    private int pos = 0;

    public ArrayCustomIterator(int[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        if (pos >= arr.length || arr[pos] == 0) {
            return false;
        } else
            return true;
    }

    @Override
    public int next() {
        return arr[pos++];
    }

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        ArrayCustomIterator it = new ArrayCustomIterator(arr);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        System.out.println("Program finished!");
    }
}
