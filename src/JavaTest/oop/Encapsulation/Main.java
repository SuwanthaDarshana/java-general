package JavaTest.oop.Encapsulation;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Suwantha", 1000);
        System.out.println("Withdraw : " + bankAccount.withdraw(500));
        System.out.println("Withdraw : " + bankAccount.withdraw(300));
        System.out.println("Deposit : " + bankAccount.deposit(2000));
        System.out.println(bankAccount.getName()+ " Your Balance is : " + bankAccount.getBalance());

    }
}
