package Lecture7_Concurrency.Ch1;

public class RabbitRunnable implements Runnable {
    int nr;
    RabbitRunnable(int nr){
        this.nr = nr;
    }
    @Override
    public void run() {
        System.out.println("Rabbit "+this.nr+" is running.");
    }
}
