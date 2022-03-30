package Lecture2.Challenge1;

public class Main {

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("Name1",2,0.5);
        Fighter fighter2 = new Fighter("Name2",3,0.7);
        BoxingMatch boxingMatch = new BoxingMatch(fighter1,fighter2) ;
        boxingMatch.fight();

    }
}
