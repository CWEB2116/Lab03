package shapePack;

public class Square extends Rectangle {
    public void printSquare() {
        System.out.println("This is Square. Subclass of Rectangle");
    }

    public void calculateArea(double side) {
        double area = side * side;
        System.out.println("Area of Square:");
        System.out.println("Enter the measure of a side: " + side);
        System.out.println("RESULT: Area of Square= " + area);
    }
}
