package Lecture2.Ch1;

public class Fighter {
    String name;
    int health;
    double damagePerAttack;

    public Fighter(String name, int health, double damagePerAttack) {
        this.name = name;
        this.health = health;
        this.damagePerAttack = damagePerAttack;
    }

    public void attack(Fighter fighter){
        fighter.health -= damagePerAttack;
    }


}
