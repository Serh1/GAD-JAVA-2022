package Lecture7_Concurrency.Ch2;

public class TransactionThread extends Thread {
    String name;
    BankAccount from;
    BankAccount to;
    double amount;
    Integer monitor;

    public TransactionThread(String name, BankAccount from, BankAccount to, double amount, Integer monitor) {
        this.name = name;
        this.from = from;
        this.to = to;
        this.amount = amount;
        this.monitor = monitor;
    }

    private void transfer(BankAccount from, BankAccount to, double amount) {
        from.withdraw(amount);
        to.deposit(amount);
        System.out.println("Transition Completed!");
    }

    @Override
    public void run() {

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        synchronized (monitor) {
            System.out.println("-----------//-----------");
            System.out.println("Thread " + name + " is running!");
            if (from.debit > amount) {
                this.transfer(from, to, amount);
                System.out.println(from.toString()+ " " + to.toString());
            } else {
                System.out.println("Transaction is not possible!");
                System.out.println(from.name + " does not have enough money!");
            }
            System.out.println("Thread " + name + " finished the transaction!");
        }
    }
}


