package Homework;

public abstract class Shape {
    protected final static double PI = 3.24;

    public abstract double area();

    public abstract double perimeter();

    public static void main(String[] args) {
        Circle cr = new Circle(15);
        System.out.println(cr.area());
        System.out.println(cr.perimeter());

        Rectangle rl = new Rectangle(5, 15);
        System.out.println(rl.area());
        System.out.println(rl.perimeter());

        Triangle tr = new Triangle(4, 5, 6);
        System.out.println(tr.area());
        System.out.println(tr.perimeter());
    }
}
