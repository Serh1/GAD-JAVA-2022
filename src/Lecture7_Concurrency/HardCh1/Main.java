package Lecture7_Concurrency.HardCh1;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(5);
        Lock lock = new ReentrantLock();
        for(int i = 0; i < 5; i ++){
            new Philosopher(semaphore,lock,2).start();
        }
    }
}
