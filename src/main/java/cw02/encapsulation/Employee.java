package cw02.encapsulation;

import java.util.Scanner;

public class Employee {
    private String name;
    private int age;
    private int salary;
    private static String planet = "Earth";

    public Employee(String name, int age, int salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static void staticMethod() {
//        System.out.println(name);
        System.out.println(planet);
    }

    public void nonStaticMethod() {
        System.out.println(name);
        System.out.println(planet);
    }

    public static String getPlanet() {
        return planet;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) throws Exception {
        if (age < 0) {
            System.out.println("Negative age value. Enter correct value:");
            age = new Scanner(System.in).nextInt();
        }
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void say(String msg) {
        makeSomeVoice(msg, 5);
    }

    public void scream(String msg) {
        makeSomeVoice(msg, 10);
    }

    private void makeSomeVoice(String msg, int value) {
        for (int i = 0; i < value; i++) {
            System.out.println(msg);
        }
    }

    public void run() {
        System.out.println(this.name + " is running!");
    }


}
