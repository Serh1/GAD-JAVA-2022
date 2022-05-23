package Lecture4_Exceptions_IO.Ch1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(findNumber("Abbey")+", "+findNumber("Abdul"));
    }

    public static String findNumber(String name){
        try{
            File phonebook = new File("C://School//3rdYear//GAD-JAVA-2022//src//Lecture4//Ch1//phonebook");
            Scanner myReader = new Scanner(phonebook);
            String contact[];
            while (myReader.hasNext()){
                contact = myReader.nextLine().split(" ");
                if(contact[0].equals(name)){
                    return contact[1];
                }


            }
        }catch (FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
        return "Not found.";
    }
}
