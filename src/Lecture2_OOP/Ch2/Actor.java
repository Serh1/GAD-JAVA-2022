package Lecture2_OOP.Ch2;

import java.util.Arrays;

public class Actor {
    String nume;
    int varsta;
    Premiu[] premii;

    Actor(String nume, int varsta, Premiu[] premii){
        this.nume = nume;
        this.varsta = varsta;
        this.premii = premii;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "nume='" + nume + '\'' +
                ", varsta=" + varsta +
                ", premii=" + Arrays.toString(premii) +
                '}';
    }
}
