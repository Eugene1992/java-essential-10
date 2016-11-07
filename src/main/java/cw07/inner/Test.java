package cw07.inner;

public class Test {
    public static void main(String[] args) {
        Ship ship = new Ship("Titanik");
        Ship.Engine engine1 = new Ship("Titanik").new Engine();
        Ship.Engine engine2 = ship.new Engine();

        System.out.println(engine1.getShipPrivateField());

    }
}
