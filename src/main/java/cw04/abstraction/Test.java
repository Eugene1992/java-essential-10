package cw04.abstraction;

/**
 * Created by Evgeniy on 31.10.2016.
 */
public class Test {
    public static void main(String[] args) {
        Shape shape = new Triangle(10, 2);
        System.out.println(shape.calcArea());
    }
}
