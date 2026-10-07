class BankAccount {
    private String accountNumber;
    private double balance;

    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance,
                          double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void addInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
}

public class BankAccountTest {
    public static void main(String[] args) {

        SavingsAccount savingsAccount =
                new SavingsAccount("123456", 1000.0, 5.0);

        savingsAccount.deposit(500.0);

        savingsAccount.addInterest();

        System.out.println("Final balance: "
                + savingsAccount.getBalance());
    }
}