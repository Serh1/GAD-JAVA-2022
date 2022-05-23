package Lecture4_Exceptions_IO.Ch4.Version2;


import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
   Version 2.0 - Stage 2 - Variable width and height for numbers.;
 */
public class NumberToLcd {
    public static int width, height;

    public static List<Integer> getInputNumbers() throws IOException {
        File data = new File("C://School//3rdYear//GAD-JAVA-2022//src//Lecture4//Ch4//Version2//input");
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
            values.add(convertNumber(n, width, height));
        }
        printResult(values);
    }

    public static void printResult(List<String[]> values) throws IOException {
        FileWriter myWriter = new FileWriter("C://School//3rdYear//GAD-JAVA-2022//src//Lecture4//Ch4//Version2//output");
        for (int line = 0; line < height; line++) {
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

    public static String[] convertNumber(int num, int width, int height) {
        String[] result = new String[height];
        // 5 3
        //   _  ;
        //    | ;
        //   _|
        //    |
        //   _|
        int w = width; // copy
        switch (num) {
            case 0:
                // 3 " _ ";
                // 4 " __ ";
                // 5 " ___ ";
                result[0] = " ";
                while (w-2 != 0) {
                    result[0] += "_";
                    w--;
                }
                result[0] += " ";

                for (int i = 1; i <= height - 2; i++) {
                    result[i] = "|";
                    for (int j = 0; j < width-2; j++) {
                        result[i] += " ";
                    }
                    result[i] += "|";
                }

                w = width;
                result[height - 1] = "|";
                while (w-2 != 0) {
                    result[height - 1] += "_";
                    w--;
                }
                result[height-1] += "|";

                break;
            case 1: // Still to work on
                for (int i = 0; i < height ; i++) {
                    for (int j = 0; j < 1; j++) {
                        result[i] += ".";
                    }
                    result[i] += "|";
                }
                break;
            case 2:
                result[0] = " ";
                while (w-3 != 0) {
                    result[0] += "_";
                    w--;
                }
                result[0] += " ";


                result[1] = " ";
                w = width;
                while (w-3 != 0) {
                    result[1] += "_";
                    w--;
                }
                result[1] += "|";



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
        width = 5;
        height = 5;
        List<Integer> numbers;
        numbers = getInputNumbers();
        printOutputNumbers(numbers);

        // Test
//        int size = 3;
//        String result = " ";
//        while (size != 0) {
//            result += "_";
//            size--;
//        }
//        System.out.println(result);

    }
}
