package Lecture7_Concurrency.Quiz;

public class MyThread extends Thread{
    public static void main(String[] args) {
    MyThread myThread = new MyThread();
    myThread.run();
    Thread t = new Thread();
    }

    @Override
    public void run() {
        for(int i = 1 ; i <3; ++i){
                System.out.println(i + " ");
        }
    }
}
