package hw2;

/**
 * Created by Марина on 27.10.2016.
 */
public class Animal {
    private String name;
    private String type;
    private int age;
    private int mass;
    private int height;
    static String home = "Zoo";
    static String eat = "food";

    public Animal(String name, String type, int age, int mass, int height) {
        this.name = name;
        this.type = type;
        this.age = age;
        this.mass = mass;
        this.height = height;
    }

    public void wherelive() {
        System.out.println(this.name + " " + "live in" + " " + home);
    }
    static void animalslive() {
        System.out.println("All animals live in" + " " + home);
    }
    public static String getHome() {
        return home;
    }
    public void eat(){
        System.out.println(this.name + " "+ "is eating!");
    }
    static void animalsEat() {
        System.out.println("All animals eating" + " " + eat+"!");
    }
    public void screem(String sms) {
        someVoise(sms, 4);
    }
    public void say(String sms){
        someVoise(sms, 3);
    }
    private void someVoise(String sms, int r) {
        for (int i = 0; i < r; i++);
        System.out.println(sms);
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public int getMass() {
        return mass;
    }

    public int getHeight() {
        return height;
    }
}