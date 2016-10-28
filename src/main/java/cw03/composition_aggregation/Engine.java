package cw03.composition_aggregation;

/**
 * Created by Evgeniy on 28.10.2016.
 */
public class Engine {
    private double volume;

    public Engine(double volume) {
        this.volume = volume;
    }

    public void on() {
        System.out.println("Br...");
    }
}
