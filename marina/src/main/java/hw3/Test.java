package hw3;

/**
 * Created by Марина on 30.10.2016.
 */
public class Test {
    public static void main(String[] args) {

        Shape square = new Square(5);
        Shape parallelogram = new Parallelogram(7, 4);
        Shape rectangle = new Rhombus(18, 7);
        Shape rhombus = new Rectangle(12, 5);
        Shape trapeze = new Triangle(13, 6);
        Shape triangle = new Trapeze(15, 11, 8);

        calcArea(square, parallelogram, rectangle, rhombus, trapeze, triangle);
    }

    static void calcArea(Shape... shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape.calcArea());
        }
    }
}

