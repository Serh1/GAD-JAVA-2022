package Lecture7_Concurrency.Ch3;

import static java.lang.Math.round;

public class Player extends Thread {
    Integer monitor;
    Player(Integer monitor){
        this.monitor = monitor;
    }
    String result;
    @Override
    public void run() {
        System.out.println(this.getName() + " running.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            synchronized (monitor) {
                System.out.println(this.getName() + " choosing.");
                int value = (int) (Math.random() * 3 + 1);
                switch (value) {
                    case 1:
                        result = "ROCK";
                        break;
                    case 2:
                        result = "PAPER";
                        break;
                    case 3:
                        result = "SCISSORS";
                        break;
                    default:
                        result = " NULL ";
                        break;
                }
                System.out.println(this.getName() + " made a choice.");

            }
    }

    public String getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "Player{" +
                "result='" + result + '\'' +
                '}';
    }
}
