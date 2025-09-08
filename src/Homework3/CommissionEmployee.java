package Homework3;

public class CommissionEmployee extends Employee {
    private double baseSalary;
    private double sales;
    private double commissionRate;

    public CommissionEmployee(String name, double baseSalary, double sales, double commissionRate) {
        super(name);
        this.baseSalary = baseSalary;
        this.sales = sales;
        this.commissionRate = commissionRate;
    }

    public double calculatePay() {
        return baseSalary + sales * commissionRate;
    }
}
