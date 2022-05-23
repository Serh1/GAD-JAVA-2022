package Lecture7_Concurrency.Ch2;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount1 = new BankAccount("Sergiu", 700);
        BankAccount bankAccount2 = new BankAccount("Paul", 400);
        Integer monitor = 1;
        System.out.println(bankAccount1 + " " + bankAccount2);
        new TransactionThread("T1", bankAccount1, bankAccount2, 1000, monitor).start();
        new TransactionThread("T2", bankAccount2, bankAccount1, 500, monitor).start();
        new TransactionThread("T3", bankAccount1, bankAccount2, 400, monitor).start();


    }
}
