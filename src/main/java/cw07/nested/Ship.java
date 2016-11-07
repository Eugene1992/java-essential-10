package cw07.nested;

import java.io.Serializable;

public class Ship extends SuperShip {
    private String name;
    private static int num;
    private Engine engine = new Engine();

    public Ship(String name) {
        this.name = name;
    }

    public static class Engine extends SuperEngine implements Serializable { // nested class
        private double volume;
        private static int num;

        public void engineMethod() {
            superShipMethod();
            superEngineMethod();
            System.out.println(superShipField);
            System.out.println(superEngineField);

//            System.out.println(name);
            System.out.println(new Ship("Titanik").name);

            System.out.println(num);
        }

        static void staticNestedEngine() {

        }
    }

    public static void f() {
        System.out.println(num);
    }
}
