package Lecture4.Ch2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(findMessage());
    }

    public static String findMessage(){
        try{
            File text = new File("C://School//3rdYear//GAD-JAVA-2022//src//Lecture4//Ch2//text");
            Scanner myReader = new Scanner(text);
            String contact,letter = "";
            while (myReader.hasNext()){
                contact = myReader.next();
                for(int i = 0; i<contact.length();i++){
                    if(Character.isUpperCase(contact.charAt(i))){
                        letter += contact.charAt(i) == 'X'? " ":contact.charAt(i);
                    }
                }
            }
            return letter;

        }catch (FileNotFoundException e){
            System.out.println("File not found");
            e.printStackTrace();
        }
        return "No  message.";
    }
}
