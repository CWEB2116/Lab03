package shapeProcess;

import shapePack.Square;
import shapePack.SemiCircle;
import java.util.Scanner;

public class ShapeExecute {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Square object and use it for both Square and Rectangle operations
        Square square = new Square();
        square.printShape();
        square.printRectangle();
        square.printSquare();

        // Get side input for Square
        System.out.println("\nArea of Square:");
        System.out.print("Enter the measure of a side: ");
        double side = scanner.nextDouble();
        square.calculateArea(side);

        // Get length and breadth input for Rectangle
        System.out.println("\nArea of Rectangle:");
        System.out.print("Enter the measure of length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the measure of breadth: ");
        double breadth = scanner.nextDouble();
        square.calculateArea(length, breadth);

        System.out.println("----");

        // Create SemiCircle object and call its methods
        SemiCircle semicircle = new SemiCircle();
        semicircle.printShape();
        semicircle.printSemiCircle();
        semicircle.printCircle();

        scanner.close();
    }
}
