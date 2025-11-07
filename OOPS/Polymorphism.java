package OOPS;

public class Polymorphism {
    public static void main(String[] args) {
        Shape s;

        s = new Circle(5);
        System.out.println("Area of Circle: " + s.area());

        s = new Rectangle(4, 5);
        System.out.println("Area of Rectangle: " + s.area());
    }
}

class Shape {
    public double area() {
        return 0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return radius;
        // complete here
    }
}

class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length;
        // complete here
    }
}
