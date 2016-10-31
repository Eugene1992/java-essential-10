package cw04.abstraction;

/**
 * Created by Evgeniy on 31.10.2016.
 */
public abstract class RoundShape extends Shape {

    public RoundShape(int side) {
        super(side);
    }

    public abstract void round();
}
