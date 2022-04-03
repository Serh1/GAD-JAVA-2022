package Lecture1.Ch2;

import java.util.Arrays;

public class Solution {
    public static String compute(int number) {
        String divisible = "",zero = "",contains = "";

        // Verify if it is divisible
        divisible += isDivisible(number);

        // Verify if the number contains '0'
        zero += containsZero(number);

        // Verify if it contains the numbers
        contains += containsNumber(number);

        if(divisible.equals("") && contains.equals("")){
            return compute2(number);
        }else{
            return divisible+zero+contains;
        }
    }

    public static String isDivisible(int x) {
        String result = "";
        if (x % 3 == 0) {
            result += "Foo";
        }
        if (x % 5 == 0) {
            result += "Bar";
        }
        if (x % 7 == 0) {
            result += "Qix";
        }
        return result;
    }

    public static String containsNumber(int x) {
        String result = "";
        String arr = Integer.toString(x);
        int[] digits = new int[arr.length()];
        for (int i = 0; i < arr.length(); i++) {
            digits[i] = Integer.parseInt(String.valueOf(arr.charAt(i)));
        }
        for (int d : digits) {
            if (d == 3) {
                result += "Foo";
            } else if (d == 5) {
                result += "Bar";
            } else if (d == 7) {
                result += "Qix";
            }
        }
        return result;
    }

    public static String containsZero(int x) {
        String result = "";
        String arr = Integer.toString(x);
        int[] digits = new int[arr.length()];
        for (int i = 0; i < arr.length(); i++) {
            digits[i] = Integer.parseInt(String.valueOf(arr.charAt(i)));
        }
        for (int d : digits) {
            if (d == 0) {
                result += '*';
            }
        }
        return result;
    }


    public static String compute2(int number) {
        StringBuilder arr = new StringBuilder(Integer.toString(number));
        for (int i = 0; i < arr.length(); i++) {
            if(arr.charAt(i) == '0'){
                arr.setCharAt(i, '*');
            }
        }
        return arr.toString();
    }

    public static void main(String[] args) {
        System.out.println(compute(105));
    }

}
