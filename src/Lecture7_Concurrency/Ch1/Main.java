package Lecture7_Concurrency.Ch1;

public class Main {
    public static void main(String[] args) {

        for(int i = 1; i<= 9; i+=2){
            new RabbitThread(i).start();
        }
        for(int i = 2; i<= 10; i+=2){
            RabbitRunnable rabbitRunnable = new RabbitRunnable(i);
            Thread t = new Thread(rabbitRunnable);
            t.start();
        }
    }
}
