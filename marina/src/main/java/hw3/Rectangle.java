package hw3;

/**
 * Created by Марина on 30.10.2016.
 */
public class Rectangle extends Shape {
    private int firstSide;

    public Rectangle(int side, int firstSide) {
        super(side);
        this.firstSide = firstSide;
    }

    public int calcArea() {
        return side * firstSide;
    }
}
