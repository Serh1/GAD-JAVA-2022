package Quiz2.Tenor;

public class Tenor extends Singer implements I1{
    public static String sing(){return "fa";}

    public static void main(String[] args) {
        Tenor t = new Tenor();
        Singer s =  new Tenor();
        System.out.println(t.sing() + " " + s.sing());
    }

}
