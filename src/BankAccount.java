public class BankAccount {
    private int balance;
    private String accountHolderName;
    private int accountNumber;

    public int getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public BankAccount(int balance, String accountHolderName, int accountNumber) {
        this.balance = balance;
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }
    public void deposit(int amount){
        balance += amount;
    }
    public void withdraw(int amount){
        balance -= amount;
    }
}
