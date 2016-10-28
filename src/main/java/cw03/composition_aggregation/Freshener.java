package cw03.composition_aggregation;

public class Freshener {
    private String smell;

    public Freshener(String smell) {
        this.smell = smell;
    }

    public void smell() {
        System.out.println("Smells good!");
    }
}
