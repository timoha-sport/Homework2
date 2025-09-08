package Homework5;

public abstract class BankAccount {
    private String accountNumber;
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public BankAccount(String accountNumber, double balance) {
        this.balance = balance;
    }

    public abstract void withdraw(double amount);

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Внесено " + amount + " на счёт." + " Текущий баланс: " + balance);
        } else {
            System.out.println("Некорректная сумма");
        }
    }

    public void addMonthlyInterest() {
    }//Без переопределения почемуто нельзя вызвать.

    public static void main(String[] args) {
        BankAccount bn = new CheckingAccount("Кекс", 900, 100);
        bn.withdraw(300);
        bn.withdraw(700);

        BankAccount bk = new SavingsAccount("Укроп", 700, 0.2);
        bk.withdraw(500);
        bk.addMonthlyInterest();
    }
}
