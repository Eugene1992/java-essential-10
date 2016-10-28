package cw03.inheritance;

public class Duck extends Animal {

    public Duck(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " said quack!");
    }
}
