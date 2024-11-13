package shapePack;

public class Rectangle extends Shape {
    public void printRectangle() {
        System.out.println("This is Rectangle. Subclass of Shape");
    }

    public void calculateArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle:");
        System.out.println("Enter the measure of length: " + length);
        System.out.println("Enter the measure of breadth: " + breadth);
        System.out.println("RESULT: Area of Rectangle= " + area);
    }
}
