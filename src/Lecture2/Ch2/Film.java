package Lecture2.Ch2;

import java.util.Arrays;

public class Film {
    int anAparitie;
    String nume;
    Actor[] actori;

    Film(int anAparitie, String nume, Actor[] actori){
        this.actori = actori;
        this.nume = nume;
        this.anAparitie = anAparitie;
    }

    @Override
    public String toString() {
        return "Film{" +
                "anAparitie=" + anAparitie +
                ", nume='" + nume + '\'' +
                ", actori=" + Arrays.toString(actori) +
                '}';
    }
}
