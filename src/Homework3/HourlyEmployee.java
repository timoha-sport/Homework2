package Homework3;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    public HourlyEmployee(String name, double hourlyRate, double hoursWorked) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public double calculatePay() {
        if (hoursWorked < 160) {
            return hourlyRate * hoursWorked;
        } else {
            return hourlyRate * hoursWorked + (hoursWorked - 160) * (hourlyRate * 1.5);
        }

    }
}
