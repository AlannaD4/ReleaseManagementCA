package Shapes;
import java.util.Scanner;

public class Circle {

    private final double PI = 3.14159;
    private double radius;

    public Circle() {
        radius = 0.0;
    }

    public Circle(double r) {
        radius = r;
    }

    public void setRadius(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return PI * radius * radius;
    }

    public double getDiameter() {
        return radius * 2;
    }

    public double getCircumference() {
        return 2 * PI * radius;
    }
	
	public static void main(String[] args) {

    // Create a Scanner object for keyboard input.
    Scanner keyboard = new Scanner(System.in);

    // Ask user to input circle radius
    System.out.print("Enter the radius of a circle: ");
    double radius = keyboard.nextDouble();

    // close keyboard
    keyboard.close();

    // Create a Circle object passing in user input    
    Circle circle = new Circle(radius);

    // Display circle information
    System.out.println("Area is " + circle.getArea());
    System.out.println("Diameter is " + circle.getDiameter());
    System.out.println("Circumference is " + circle.getCircumference());

}
}
