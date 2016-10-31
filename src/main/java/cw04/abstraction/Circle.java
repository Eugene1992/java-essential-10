package cw04.abstraction;

/**
 * Created by Evgeniy on 31.10.2016.
 */
public class Circle extends RoundShape {

    public Circle(int side) {
        super(side);
    }

    @Override
    public double calcArea() {
        return 0;
    }

    @Override
    public void round() {

    }
}
