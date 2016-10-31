package cw04.interfaces;

/**
 * Created by Evgeniy on 31.10.2016.
 */
public class Test {
    public static void main(String[] args) {
        Moveable human = new Human(30);
        Moveable car = new Car(100);
        Moveable cat = new Car(40);
        Moveable wind = new Wind(70);

        human.d();
        Moveable.s();

        Moveable[] moveables = {human, car, cat, wind};
        printDistances(moveables, 5);
    }

    private static void printDistances(Moveable[] moveables, int hours) {
        for (Moveable moveable : moveables) {
            System.out.println(moveable.calcDistance(hours));
        }
    }
}
