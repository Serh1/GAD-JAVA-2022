package Lecture5_Generics.Ch4;

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
