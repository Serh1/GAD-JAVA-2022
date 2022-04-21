package Lecture5.Ch4;

import java.util.List;

public class ArrayIterator<T> implements IArrayIterator{
    private T[] arr;
    private T current;
    public ArrayIterator(T[] arr) {
        this.arr = arr;
    }

    @Override
    public boolean hasNext() {
        // TODO

        return false;
    }

    @Override
    public T next() { // TODO
        return null;
    }
}
