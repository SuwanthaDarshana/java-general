package JavaTest.oop.Encapsulation;

public class BankAccount {

    private String name;
    private double balance;

    public BankAccount(String name, double balance){
        this.balance = Math.max(balance, 0);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double deposit(double amount){
        if(amount > 0){
            this.balance = this.balance + amount;
            return amount;
        }
        return 0;
    }

    public double withdraw(double amount){
        if(amount <= this.balance){
            this.balance = this.balance - amount;
            return amount;
        }
        return 0;
    }
}
