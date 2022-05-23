package Lecture2_OOP.Ch1;

public class BoxingMatch {
    public static Fighter fighter1;
    public static Fighter fighter2;
    BoxingMatch(Fighter fighter1,Fighter fighter2){
        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
    }

    public static String fight(Fighter f1, Fighter f2){
        System.out.println("Match started!");
        while(f1.health > 0 && f2.health > 0){
            f1.attack(f2);
            System.out.println(f1.name +" attacking " +f2.name);
            f2.attack(f1);
            System.out.println(f2.name +" attacking " +f1.name);
            System.out.println("Health status: "+f1.name+"= " +f1.health + " and "+f2.name+"= "+f2.health);
            System.out.println("");
        }
        System.out.println(f1.health>f2.health?f1.name:f2.name);
        return "";
    }
}
