package hw3;

import java.util.Scanner;

/**
 * Created by Марина on 30.10.2016.
 */
public class Square extends Shape {

    public Square(double side) {
        super((double) side);
    }
    protected void areaSquare (double side){

        double area;

        area = Math.pow(side, 2);
    }


}
