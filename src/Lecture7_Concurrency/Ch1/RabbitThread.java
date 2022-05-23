package Lecture7_Concurrency.Ch1;

public class RabbitThread extends Thread{
    int nr;
    RabbitThread(int nr){
        this.nr = nr;
    }
    @Override
    public void run() {
        System.out.println("Rabbit "+this.nr+" is running.");
    }
}
