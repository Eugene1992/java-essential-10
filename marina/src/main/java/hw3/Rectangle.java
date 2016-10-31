package hw3;

/**
 * Created by Марина on 30.10.2016.
 */
public class Rectangle extends Shape {
    private int firstside;

    public Rectangle(int side, int firstside) {
        super(side);
        this.firstside = firstside;
    }

    public int calcArea() {
        return side * firstside;
    }
}
