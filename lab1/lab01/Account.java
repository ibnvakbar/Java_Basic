/**
 * Created by rama on 9/16/17.
 */
public class Account {
    private double balance;

    public Account(){
        this.balance=0;
    }

    public Account(int newBalance){
        this.balance = newBalance;
    }

    public void deposit(int money){
        double fee = money*0.15;
        this.balance += money-fee;
    }

    public void withdraw(int money) {
        double fee=money*0.15;
        if ((this.balance-money-fee) < 0) {
            System.out.println("Penarikan tidak bisa dilakukan. Sisa saldo anda"+" "+this.balance);
        } else {
            this.balance -= money-fee;
        }
    }

    public void setBalance(int newBalance){
        this.balance = newBalance;
    }

    public String getBalance(){
        return "Balance:"+" "+this.balance;
    }
}

