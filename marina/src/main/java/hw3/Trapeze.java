package hw3;

/**
 * Created by Марина on 30.10.2016.
 */
public class Trapeze extends Shape {
    private int firstside;
    private int height;

    public Trapeze(int side, int firstside, int height) {
        super(side);
        this.firstside = firstside;
        this.height = height;
    }

    public int calcArea() {
        return ((side*firstside)/2)*height;
    }
}
