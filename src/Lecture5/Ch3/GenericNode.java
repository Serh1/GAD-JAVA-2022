package Lecture5.Ch3;

import java.util.List;

public class GenericNode<T> implements IGenericNode{

    private Object next;
    private Object value;
    public GenericNode(Object value){
        this.value = value;
        next = null;
    }

    @Override
    public Object getValue() {
        return value;
    }

    @Override
    public void setValue(Object value) {
        this.value = value;
    }

    @Override
    public GenericNode<T> getNext() {
        return (GenericNode<T>) next;
    }

    @Override
    public void setNext(IGenericNode next) {
        this.next = next;
    }


}
