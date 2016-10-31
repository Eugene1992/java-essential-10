package hw3;

/**
 * Created by Марина on 30.10.2016.
 */
public class Shape {
    protected String name;
    protected double side;



    public Shape(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Shape(double side) {
         this.side = side;
        this.name = name;
    }

    public double getSide() {
        return side;
    }

}
