package Lecture7_Concurrency.Ch2;

public class BankAccount {
    String name;
    double debit;
    BankAccount(String name,double debit){
        this.name = name;
        this.debit = debit;
    }

    void withdraw(double amount){
        longDatabaseCall();
        this.debit -= amount;
        System.out.println("Withdrew "+amount+" from your account," + name);
    }

    void deposit(double amount){
        longDatabaseCall();
        this.debit += amount;
        System.out.println("Added "+amount+" to your account,"+ name);
    }

    void longDatabaseCall(){
        try{
            Thread.sleep(100);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "name='" + name + '\'' +
                ", debit=" + debit +
                '}';
    }
}
