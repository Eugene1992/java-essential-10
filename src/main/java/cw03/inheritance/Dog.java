package cw03.inheritance;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void speak() {
        System.out.println(name + " said woof!");
    }
}
