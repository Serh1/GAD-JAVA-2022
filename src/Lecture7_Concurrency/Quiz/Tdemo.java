package Lecture7_Concurrency.Quiz;

public class Tdemo {
    public static void main(String[] args) {
        Thread t = new TheThread() {
            public void run() {
                System.out.println("foo");
            }
        };
        t.start();
    }
}
