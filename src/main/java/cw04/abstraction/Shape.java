package cw04.abstraction;

/**
 * Created by Evgeniy on 31.10.2016.
 */
public abstract class Shape {
    protected int side;

    public Shape(int side) {
        this.side = side;
    }

    public abstract double calcArea();

    public void f() {

    }
}
