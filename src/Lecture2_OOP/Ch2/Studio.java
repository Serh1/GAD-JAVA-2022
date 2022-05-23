package Lecture2_OOP.Ch2;

import java.util.Arrays;

public class Studio {
    String nume;
    Film[] filme;

    Studio(String nume, Film[] filme){
        this.nume = nume;
        this.filme = filme;
    }

    @Override
    public String toString() {
        return "Studio{" +
                "nume='" + nume + '\'' +
                ", filme=" + Arrays.toString(filme) +
                '}';
    }
}
