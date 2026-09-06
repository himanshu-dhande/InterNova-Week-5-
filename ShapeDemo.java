abstract class Shape {

    abstract void calculateArea();

    void displayMessage() {
        System.out.println("Calculating area...");
    }
}

class Circle extends Shape {

    double radius = 5;

    void calculateArea() {
        double area = 3.14 * radius * radius;
        System.out.println("Circle Area = " + area);
    }
}

class Rectangle extends Shape {

    int length = 10;
    int width = 5;

    void calculateArea() {
        int area = length * width;
        System.out.println("Rectangle Area = " + area);
    }
}

public class ShapeDemo {

    public static void main(String[] args) {

        Circle c = new Circle();
        c.displayMessage();
        c.calculateArea();

        System.out.println();

        Rectangle r = new Rectangle();
        r.displayMessage();
        r.calculateArea();
    }
}