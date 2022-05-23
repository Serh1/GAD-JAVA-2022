package Lecture5_Generics.Ch2;

public class Main {
    public static void main(String[] args) throws SizesDoNotMatchException, ColorsDoNotMatchException {
        try{
        Running runningShoe1 = new Running("RED", 41);
        Running runningShoe2 = new Running("RED", 41);
        Running runningShoe3 = new Running("RED", 40);
        Boot bootShoe = new Boot("BLACK", 45);
        Pair<Running> pairOK = new Pair<>(runningShoe1, runningShoe2);
        Pair<Running> pairOK2 = new Pair<>(runningShoe1, runningShoe3);
        System.out.println(pairOK.getFirst().toString());
        System.out.println(pairOK2.getFirst());
        //  Pair<Running> pairFAIL = new Pair<>(runningShoe1,bootShoe); //I can't do this
    }catch (SizesDoNotMatchException | ColorsDoNotMatchException e){
        e.printStackTrace();
    }
    }
}
