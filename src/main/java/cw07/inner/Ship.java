package cw07.inner;

import java.io.Serializable;

/**
 * - inner(внутренние) non-static classes
 *    - local classes
 *    - anonymous classes
 * - nested(вложенные) static classes
 */
public class Ship extends SuperShip {
    
    private String name;
    private static int num;
    private Engine engine = new Engine();

    public Ship(String name) {
        this.name = name;
    }

    public final class Engine extends SuperEngine implements Serializable { // inner class
        
        private double volume;

        public void engineMethod() {
            Ship.super.superShipMethod();
            superEngineMethod();
            System.out.println(superShipField);
            System.out.println(superEngineField);

            System.out.println(name);
            System.out.println(num);
        }

        public String getShipPrivateField() {
            return name;
        }
    }

    public void shipMethod() {
        engine.engineMethod();
        superShipMethod();
        engine.superEngineMethod();
        System.out.println(superShipField);
        System.out.println(engine.superEngineField);
    }
}
