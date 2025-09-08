package Homework5;

public class CheckingAccount extends BankAccount{

    private double overdraftLimit;

    public CheckingAccount(String accountNumber, double balance, double overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public void withdraw (double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            setBalance(getBalance() - amount);
            System.out.println("Выведено " + amount + " со счёта." + " Текущий баланс: " + getBalance());
        } else {
            System.out.println("Не достаточно средств на счету");
        }
    }

}
