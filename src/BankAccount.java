/**
 * Created by rama on 9/7/17.
 */
public class BankAccount {

    private double balance;

    public BankAccount(){
        balance = 0;
    }

    public BankAccount(double initialBalance){
        balance=initialBalance;
    }

    public void deposit(double amount){
        balance = balance + amount;
    }

    public void withdraw(double amount){
        balance = balance - amount;
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String[]args){
        BankAccount cek = new BankAccount();
        cek.deposit(2000);
        cek.withdraw(190);
        System.out.println("Balance: "+cek.getBalance());
    }
}
