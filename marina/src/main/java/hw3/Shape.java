package hw3;

/**
 * Created by Марина on 30.10.2016.
 */
public abstract class Shape {

    protected int side;


    public Shape(int side) {
        this.side = side;
    }

    public abstract int calcArea();


}
