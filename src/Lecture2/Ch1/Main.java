package Lecture2.Ch1;

public class Main {

    public static void main(String[] args) {
        Fighter fighter1 = new Fighter("McGregor",100,20);
        Fighter fighter2 = new Fighter("Josua",98,30);
        BoxingMatch boxingMatch = new BoxingMatch(fighter1,fighter2) ;
        boxingMatch.fight(fighter1,fighter2);

    }
}
