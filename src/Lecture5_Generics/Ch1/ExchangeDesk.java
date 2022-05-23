package Lecture5_Generics.Ch1;

import java.lang.reflect.InvocationTargetException;

public class ExchangeDesk<F extends Currency, T extends Currency > {
    private double rate;
    public void addRate(Class<F> fromClass, Class<T> toClass, Double value ){
        rate = value;
    }
    public T convert(F from,Class<T> toClass) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        T toReturn = null;
        double value = from.getValue()* rate;
        toReturn = toClass.getDeclaredConstructor(double.class).newInstance(value);

        return toReturn;
    }

    public static void main(String[] args) {
        ExchangeDesk<USD,RON> exchangeDesk = new ExchangeDesk<>();
        exchangeDesk.addRate(USD.class,RON.class,4.1d);
        USD usd = new USD(10);
        try {
            RON ron = exchangeDesk.convert(usd, RON.class);
            System.out.println(ron.toString());
        }catch (Exception e){
            e.printStackTrace();
        }

    }

}
