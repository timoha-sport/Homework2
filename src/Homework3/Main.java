package Homework3;

public class Main {
    public static void main(String[] args) {
        Employee[] arr = new Employee[3];

        arr[0] = new HourlyEmployee("Bob", 150, 5);
        arr[1] = new SalariedEmployee("Tim",1200);
        arr[2] = new CommissionEmployee("Bill",90, 500,1.2);

        for (Employee employee : arr) {
            System.out.println(employee.calculatePay());
        }
    }
}
