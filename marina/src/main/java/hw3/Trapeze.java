package hw3;

/**
 * Created by Марина on 30.10.2016.
 */
public class Trapeze extends Shape {
    private int firstSide;
    private int height;

    public Trapeze(int side, int firstSide, int height) {
        super(side);
        this.firstSide = firstSide;
        this.height = height;
    }

    public int calcArea() {
        return side * firstSide / 2 * height;
    }
}
