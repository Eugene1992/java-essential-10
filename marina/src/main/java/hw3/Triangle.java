package hw3;

/**
 * Created by Марина on 30.10.2016.
 */
public class Triangle extends Shape {
    private int height;


    public Triangle(int side, int height) {
        super(side);
        this.height = height;
    }

    public int calcArea() {
        return (int) (0.5*side*height);
    }
}
