package Lecture7_Concurrency.Quiz;

public class TheThread extends Thread{
    TheThread(){
        System.out.println("TheThread");
    }

    public void run() {
        System.out.println("bar");
    }
    public void run(String s) {
        System.out.println("baz");
    }
}

