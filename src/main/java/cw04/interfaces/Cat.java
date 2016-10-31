package cw04.interfaces;

/**
 * Created by Evgeniy on 31.10.2016.
 */
public class Cat implements Moveable {
    private int speed;

    public Cat(int speed) {
        this.speed = speed;
    }

    @Override
    public int calcDistance(int time) {
        return speed * time;
    }
}
