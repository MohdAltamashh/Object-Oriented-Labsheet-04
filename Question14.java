import java.util.Scanner;

abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class Question14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rectangle length and width: ");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        System.out.print("Enter circle radius: ");
        double radius = sc.nextDouble();

        if (length < 0 || width < 0 || radius < 0) {
            System.out.println("Dimensions cannot be negative.");
        } else {
            Shape rectangle = new Rectangle(length, width);
            Shape circle = new Circle(radius);
            System.out.printf("Rectangle area = %.2f%n", rectangle.calculateArea());
            System.out.printf("Circle area = %.2f%n", circle.calculateArea());
        }
        sc.close();
    }
}
