package Lecture2.Ch2;

public class Premiu {
    String nume;
    int an;
    Premiu(String nume, int an){
        this.nume = nume;
        this.an = an;
    }

    @Override
    public String toString() {
        return "Premiu{" +
                "nume='" + nume + '\'' +
                ", an=" + an +
                '}';
    }
}
