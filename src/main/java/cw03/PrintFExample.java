package cw03;

/**
 * Created by Evgeniy on 28.10.2016.
 */
public class PrintFExample {
    public static void main(String[] args) {
        String name = "Ivan";
        int age = 23;

        System.out.println("My name is " + name + ". I'm " + age + " years old." );
        System.out.printf("My name is %s. I'm %d years old", name, age);
    }
}
