package hw3;

/**
 * Created by Марина on 30.10.2016.
 */
public class Rhombus extends Shape {
    private int height;

    public Rhombus(int side, int height) {
        super(side);
        this.height = height;
    }

    public int calcArea() {
        return side*height;
    }
}
