package Lecture7_Concurrency.Quiz;

public class ThreadDemo implements Runnable {
    String x,y;

//    int addX(){
//        x++;
//        return x;
//    }
//    int addY(){
//        y++;
//        return y;
//    }

    public static void main(String[] args) throws InterruptedException {
        ThreadDemo threadDemo1 = new ThreadDemo();
        Thread t1 = new Thread(threadDemo1);
        Thread t2 = new Thread(threadDemo1);
        t1.start();
        t2.start();

    }

    @Override
    public void run() {
        for(int i = 0 ; i <10; i++){
            synchronized (this){
                x = "da";
                y = "nu";
                System.out.println(x + " " + y);
            }
        }
    }
}
