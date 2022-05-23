package Lecture4_Exceptions_IO.Ch5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Occurrence {
    public static void displayOccurances() throws FileNotFoundException {
        File data = new File("C://School//3rdYear//GAD-JAVA-2022//src//Lecture4//Ch5//text");
        Scanner myReader = new Scanner(data);
        List<String> words = new ArrayList<>();
        Set<String> set = new HashSet<>();
        while (myReader.hasNext()) {
            String word = myReader.next();
            word = word.toLowerCase(Locale.ROOT);
            words.add(word);
        }
        words.removeIf(w -> w.equals("?"));
        words.removeIf(w -> w.equals("!"));
        for (String w : words) {
            set.add(w);
        }

        int[] occur = new int[set.size()];
        int i = 0;
        for(String s:set){
            occur[i] = countOccurence(words, s);
            System.out.println(s+" - "+occur[i]);
            i++;
        }
    }

    public static int countOccurence(List<String> words, String word) {
        int count = 0;
        for (String w : words) {
            if (w.equals(word)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) throws FileNotFoundException {
        displayOccurances();
    }

}
