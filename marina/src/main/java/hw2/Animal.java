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

    public Animal(String name, String type, int age, int mass, int height){
        this.name = name;
        this.type = type;
        this.age = age;
        this.mass = mass;
        this.height = height;
    }

    public void wherelive(){
        System.out.println(this.name+" "+ "live in" +" "+ home);
    }
    static void animalslive(){
        System.out.println("All animals live in" + " " + home);
    }
     public static String getHome(){
         return home;
     }




}