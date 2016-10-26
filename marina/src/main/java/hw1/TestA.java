package hw1;

/**
 * Created by Марина on 25.10.2016.
 */
public class TestA {
    public static void main(String[] args) {
        Animal an1 = new Animal();
        an1.name = "Giraf";
        an1.age = 12;
        an1.height = 9;
        an1.mass = 245;
        an1.type = "tropic";

        Animal an2 = new Animal();
        an2.name = "Cow";
        an2.age = 3;
        an2.height = 4;
        an2.mass = 268;
        an2.type = "home";

        Animal an3 = new Animal();
        an3.name = "Elephant";
        an3.age = 32;
        an3.height = 8;
        an3.mass = 465;
        an3.type = "tropic";

        Animal an4 = new Animal();
        an4.name = "Wolf";
        an4.age = 41;
        an4.height = 3;
        an4.mass = 121;
        an4.type = "wild";

        Animal an5 = new Animal();
        an5.name = "Parrot";
        an5.age = 2;
        an5.height = 1;
        an5.mass = 1;
        an5.type = "home";

        Animal an6 = new Animal();
        an6.name = "Squirrel";
        an6.age = 6;
        an6.height = 2;
        an6.mass = 10;
        an6.type = "wild";

        Animal[] anim = {an1, an2, an3, an4, an5, an6};
        System.out.println("Heigest");
        System.out.println(getHeigestAnimal(anim).name);
        System.out.println("Young");
        System.out.println(getYougAnimal(anim).name);
        System.out.println("Tropic");
        System.out.println(getTropicAnimal(anim).name);
        System.out.println("Mass Animals");
        //System.out.println(sortMasAnimals(anim).name);
    }


    static Animal getHeigestAnimal(Animal[] anim) {
        Animal max = anim[0];
        for (Animal animal : anim) {
            if (animal.height > max.height) max = animal;
        }
        return max;
    }

    static Animal getYougAnimal(Animal[] anim) {
        Animal min = anim[0];
        for (Animal animal : anim) {
            if (animal.age < min.age) min = animal;
        }
        return min;
    }

    static Animal getTropicAnimal(Animal[] anim) {
        Animal tr = anim[0];
        for (Animal animal : anim) {
            if (animal.type == "tropic") ;
        }
        return tr;
    }

    static int sortMasAnimals(int[] anim) {
        int animal = anim[0];
        for (int i = anim.length - 1; i > 0; i--)
            for (int j = 0; j < i; j++) {
                if (anim[j] > anim[j + 1]) {
                    int tmp = anim[j];
                    anim[j] = anim[j + 1];
                    anim[j + 1] = tmp;
                }

            }
        return animal;
    }
}
