package Lecture4.Ch4.Version1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
/*
    Version 1.0 - Stage 1 - Numbers height = 3;
 */


public class NumberToLcd {
    public static List<Integer> getInputNumbers() throws IOException {
        File data = new File("C://School//3rdYear//GAD-JAVA-2022//src//Lecture4//Ch4//Version1//input.txt");
        Scanner myReader = new Scanner(data);
        String num;
        List<Integer> numbers = new ArrayList<>();
        while (myReader.hasNext()) {
            num = myReader.next();
            for (char digit : num.toCharArray()) {
                numbers.add(Integer.parseInt(String.valueOf(digit)));
            }
        }
        return numbers;
    }

    public static void printOutputNumbers(List<Integer> numbers) throws IOException {

        List<String[]> values = new ArrayList<>();
        String[][] num = new String[3][];
        for (Integer n : numbers) {
            values.add(convertNumber(n));
        }
        printResult(values);
    }

    public static void printResult(List<String[]> values) throws IOException {
        FileWriter myWriter = new FileWriter("C://School//3rdYear//GAD-JAVA-2022//src//Lecture4//Ch4//Version1//output.txt");
        for (int line = 0; line < 3; line++) {
            for (int inputI = 0; inputI < values.size(); inputI++) {
                myWriter.append(values.get(inputI)[line]);
                System.out.print(values.get(inputI)[line]); // Also print in console to verify
                System.out.print(" ");
            }
            myWriter.write("\n");
            System.out.println();
        }
        myWriter.close();
    }

    public static String[] convertNumber(int num) {
        String[] result = new String[3];
        switch (num) {
            case 0:
                result[0] = " _ ";
                result[1] = "| |";
                result[2] = "|_|";
                break;
            case 1:
                result[0] = "   ";
                result[1] = " | ";
                result[2] = " | ";
                break;
            case 2:
                result[0] = " _ ";
                result[1] = " _|";
                result[2] = "|_ ";
                break;
            case 3:
                result[0] = " _ ";
                result[1] = " _|";
                result[2] = " _|";
                break;
            case 4:
                result[0] = "   ";
                result[1] = "|_|";
                result[2] = "  |";
                break;
            case 5:
                result[0] = " _ ";
                result[1] = "|_ ";
                result[2] = " _|";
                break;
            case 6:
                result[0] = " _ ";
                result[1] = "|_ ";
                result[2] = "|_|";
                break;
            case 7:
                result[0] = " _ ";
                result[1] = "| |";
                result[2] = "  |";
                break;
            case 8:
                result[0] = " _ ";
                result[1] = "|_|";
                result[2] = "|_|";
                break;
            case 9:
                result[0] = " _ ";
                result[1] = "|_|";
                result[2] = " _|";
                break;
            default:

                break;
        }

        return result;
    }


    public static void main(String[] args) throws IOException {
        List<Integer> numbers;
        numbers = getInputNumbers();
        printOutputNumbers(numbers);


    }
}
