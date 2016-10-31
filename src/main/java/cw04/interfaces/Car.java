package cw04.interfaces;

import java.io.Serializable;

/**
 * Created by Evgeniy on 31.10.2016.
 */
public class Car implements Moveable, Serializable, Cloneable {
    private int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    @Override
    public int calcDistance(int time) {
        return speed * time;
    }
}
