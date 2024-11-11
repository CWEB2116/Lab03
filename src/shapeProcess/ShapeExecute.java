package shapeProcess;

import shapePack.Shape;
import shapePack.Rectangle;
import shapePack.Square;
import shapePack.Circle;
import shapePack.SemiCircle;

public class ShapeExecute {
    public static void main(String[] args) {
        Square square = new Square();
        square.printShape();
        square.printRectangle();
        square.printSquare();

        System.out.println("----");

        SemiCircle semicircle = new SemiCircle();
        semicircle.printShape();
        semicircle.printSemiCircle();
        semicircle.printCircle();
    }
}
