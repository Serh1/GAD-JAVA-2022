package Lecture4_Exceptions_IO.Exceptions.Ex;

public class Main {
    public static int test(){
        try{
            return 0;
        }catch (Exception ex){
            return 1;
        }finally {
            return 2;
        }
    }

    public static void main(String[] args) {
        System.out.println(test());
    }


}
