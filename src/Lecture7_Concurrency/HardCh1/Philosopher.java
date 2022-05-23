package Lecture7_Concurrency.HardCh1;

import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;

public class Philosopher extends Thread {
    Semaphore semaphore;
    Lock lock;
    int permits;

    Philosopher(Semaphore semaphore, Lock lock, int permits) {
        this.semaphore = semaphore;
        this.lock = lock;
        this.permits = permits;
    }

    @Override
    public void run() {
            try {

                System.out.println(this.getName() + " is running");
                this.semaphore.acquire(2);
                lock.lock();
                System.out.println(this.getName() + " took 2 chopsticks ");
                System.out.println(this.getName() + " is eating");
                this.semaphore.release();
                System.out.println(this.getName() + " ate and release the chopsticks");
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                this.lock.unlock();
            }
    }
}
