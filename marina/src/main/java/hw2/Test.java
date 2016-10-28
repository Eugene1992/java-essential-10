package hw2;

/**
 * Created by Марина on 27.10.2016.
 */
public class Test {
    public static void main(String[] args) {
        Animal giraf = new Animal("Giraf", "tropic", 12, 245, 9);
        Animal cow = new Animal("Cow", "home", 3, 268, 4);
        Animal elephant = new Animal("Elephant", "tropic", 32, 465, 8);
        Animal wolf = new Animal("Wolf", "wild", 41, 121, 3);
        Animal parrot = new Animal("Parrot", "home", 2, 1, 1);
        Animal squirrel = new Animal("Squirrel", "wild", 6, 10, 2);

        wolf.wherelive();
        Animal.animalslive();
    }
}