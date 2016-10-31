package hw3;

/**
 * Created by Марина on 30.10.2016.
 */
public class Square extends Shape {

    public Square(String name) {
        super(name);
    }

    public Square(double side) {
        super((double)side);

    }
    protected static void areaSquare(double side){

        double area;

        area = Math.pow(side, 2);
    }
    public void areaM(){
        areaSquare(8);


    }

}
