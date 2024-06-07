package OOPs.OOPs3.DataHiding;

public class Account {
    public int accountID;
    private int balance;
    private int pin;

    public void addBalance(int additionalAmount) {
        this.balance += additionalAmount;
    }

    public int getBalance() {
        return balance;
    }

    public Account(int accountID, int initialBalance, int pin) {
        this.accountID = accountID;
        this.balance = initialBalance;
        this.pin = pin;
    }
}
