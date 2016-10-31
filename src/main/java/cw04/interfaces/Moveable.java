package cw04.interfaces;

/**
 * Created by Evgeniy on 31.10.2016.
 */
public interface Moveable {

    public static final int SOME_VAR = 10;

    public abstract int calcDistance(int time); // before Java 1.8

    public static void s() {
        System.out.println("Hello from static method");
    }

    public default void d() {
        System.out.println("Hello from default method");
    }

//    public void doSomething();
}