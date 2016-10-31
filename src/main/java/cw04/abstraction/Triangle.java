package cw04.abstraction;

/**
 * Created by Evgeniy on 31.10.2016.
 */
public class Triangle extends Shape {
    private int height;

    public Triangle(int side, int height) {
        super(side);
        this.height = height;
    }

    @Override
    public double calcArea() {
        return 0.5 * side * height;
    }
}
