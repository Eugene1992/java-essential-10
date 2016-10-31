package hw3;

/**
 * Created by Марина on 30.10.2016.
 */
public class Square extends Shape {


    public Square(int side) {
        super(side);

    }

    public int calcArea() {
        return side * side;
    }


}
