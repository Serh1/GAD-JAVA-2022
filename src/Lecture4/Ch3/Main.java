package Lecture4.Ch3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(findAnagrams("listen"));
    }

    public static List<String> findAnagrams(String name) {

        try {
            File listOfWords = new File("C://School//3rdYear//GAD-JAVA-2022//src//Lecture4//Ch3//BigList");
            Scanner myReader = new Scanner(listOfWords);
            String word;
            List<String> result = new ArrayList<>();
            char[] wordChar, nameChar = name.toCharArray();
            Arrays.sort(nameChar);

            while (myReader.hasNext()) {
                word = myReader.next();
                if (word.length() == name.length()) {
                    wordChar = word.toCharArray();
                    Arrays.sort(wordChar);
                    if (Arrays.equals(wordChar, nameChar)) {
                        result.add(word);
                    }
                }
            }
            return result;
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        return null;
    }


}
