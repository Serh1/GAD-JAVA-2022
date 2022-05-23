package Lecture5_Generics.Ch3;

import java.util.ArrayList;
import java.util.List;

public class GenericList<T> implements IGenericList{
    private List<Object> list;
    private T rootValue;
    public GenericList(T rootValue){
        list = new ArrayList<>();
        this.rootValue = rootValue;
        list.add(rootValue);
    }
    @Override
    public void insert(Object element) {
        list.add(element);
    }

    @Override
    public void println() {
        System.out.println(list.toString());
    }
}
