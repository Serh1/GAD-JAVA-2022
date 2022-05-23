package Lecture4_Exceptions_IO.Ch2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(findMessage());

       //
        Set<String> s = new HashSet<>();
        s.add("1");
        s.add("3");
        s.add("4");
        s.add("3");
        s.add("4");
        System.out.println(s.size());
        List<String> ar = new LinkedList<>();
        ar.add("b");
        ar.add("a");
        ar.add("c");
        Iterator<String> it = ar.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        System.out.println(ar);
    }

    public static String findMessage() {
        try {
            File text = new File("C://School//3rdYear//GAD-JAVA-2022//src//Lecture4//Ch2//text");
            Scanner myReader = new Scanner(text);
            String contact, letter = "";
            while (myReader.hasNext()) {
                contact = myReader.next();
                for (int i = 0; i < contact.length(); i++) {
                    if (Character.isUpperCase(contact.charAt(i))) {
                        letter += contact.charAt(i) == 'X' ? " " : contact.charAt(i);
                    }
                }
            }
            Integer.parseInt("123");
            return letter;

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
            e.printStackTrace();
        }
        return "No  message.";
    }
}
