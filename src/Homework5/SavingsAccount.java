package Homework5;

public class SavingsAccount extends BankAccount {

    private final double interestRate;

    public SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    public void withdraw(double amount) {
        if (getBalance() - amount >= 0) {
            setBalance(getBalance() - amount);
            System.out.println("Выведено " + amount + " со счёта." + " Текущий баланс: " + getBalance());
        } else {
            System.out.println("Не достаточно средств на счету");
        }
    }

    public void addMonthlyInterest() {
        setBalance(getBalance() * (1 + interestRate));
        System.out.println("Вы получили " + interestRate + " процентов со счёта.");
    }
}
