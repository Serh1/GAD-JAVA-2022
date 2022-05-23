package Lecture5_Generics.Ch3;

public interface IGenericNode<T> {
    T getValue();
    void setValue(T value);
    IGenericNode<T> getNext();

    void setNext(IGenericNode<T> next);
}
