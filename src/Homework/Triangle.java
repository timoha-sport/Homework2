package Homework;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    private boolean check() {
        return a + b > c && a + c > b && b + c > a;
    }

    public double area() {
        double p = (a + b + c) / 2;
        if (check()) {
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        } else {
            return 0;
        }
    }

    public double perimeter() {
        if (check()) {
            return a + b + c;
        } else {
            return 0;
        }

    }
}
