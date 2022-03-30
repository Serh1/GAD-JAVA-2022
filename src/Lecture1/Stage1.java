package Lecture1;

public class Stage1 {
    public static boolean isMultiple(int n, int mult) {
        return n % mult == 0;
    }

    public static void main(String[] args) {

        String first = "da";
        String second = "nu";
        first = second;
        if(first == second){
            return;
        }
        for (int i = 1; i <= 100; i++) {
            if (isMultiple(i, 5) && isMultiple(i, 3)) {
                System.out.print("FizzBuzz, ");
            } else if (isMultiple(i, 3)) {
                System.out.print("Fizz, ");
            } else if (isMultiple(i, 5)) {
                System.out.print("Buzz, ");
            } else if (isMultiple(i, 7)) {
                System.out.print("Rizz, ");
            } else if (isMultiple(i, 11)) {
                System.out.print("Jazz, ");
            } else
                System.out.print(i + ", ");
        }
    }
}
