package Task;

public class ThisAll {

    public static void main(String args[]) {

    BankAccount ba = new BankAccount();
    ba.deposit(12.12);
    }
}

class BankAccount {
    private double balance;

    public void deposit(double amount) {
        this.updateBalance(amount); // Calls updateBalance on the current object
    }

    private void updateBalance(double amount) {
        balance += amount;
    }
}
