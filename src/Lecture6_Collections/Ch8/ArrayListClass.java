package Lecture6_Collections.Ch8;

import java.util.Arrays;

public class ArrayListClass<T> implements MyArrayList<T> {
    private T[] list;
    private int size;
    ArrayListClass(T[] list){
        this.list = list;
        this.size = 0;
    }

    @Override
    public void add(T e) {
        list[size++] = e;
    }

    @Override
    public void remove(T e) {
        for(int i = 0;i<list.length;i++){
            if(e.equals(list[i])){
                list[i]=null;
                size--;
                return;
            }
        }
    }

    @Override
    public T get(int index) {
        if(index>0 && index<list.length){
            return list[index];
        }
        return null;
    }

    @Override
    public void set(int index, T e) {
        list[index] = e;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String toString() {
        return "ArrayListClass{" +
                "list=" + Arrays.toString(list) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        Integer[] a = new Integer[3];
        ArrayListClass<Integer> arr = new ArrayListClass(a);
        arr.add(3);
        arr.add(6);
        System.out.println(arr.size);
        System.out.println(arr);
        arr.remove(3);
        System.out.println(arr);
        System.out.println(arr.get(1));
        arr.set(1,8);
        System.out.println(arr);
    }
}
