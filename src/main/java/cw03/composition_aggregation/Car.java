package cw03.composition_aggregation;

public class Car {
    private String model;
    private String color;
    private Engine engine = new Engine(1.7);
    private Freshener freshener;

    public Car(String model, String color, Freshener freshener) {
        this.model = model;
        this.color = color;
        this.freshener = freshener;
    }

    public void ride() {
        engine.on();
        freshener.smell();
        System.out.println("Move....");
    }
}
