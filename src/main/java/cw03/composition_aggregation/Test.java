package cw03.composition_aggregation;

/**
 * Created by Evgeniy on 28.10.2016.
 */
public class Test {
    public static void main(String[] args) {
        Freshener freshener = new Freshener("Apple");
        Car car = new Car("Tesla", "X", freshener);
        car.ride();

        car = null;
    }
}
