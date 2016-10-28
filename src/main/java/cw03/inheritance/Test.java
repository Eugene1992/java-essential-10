package cw03.inheritance;

public class Test {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik");
        Animal cat2 = new Cat("Murka"); // upcast
        Animal animal = new Animal("Animal");
        Duck duck = new Duck("Donald");
        Animal dog = new Dog("Rex");
        Snake snake = new Snake("Koa");

        makeVoices(cat1, cat2, dog, duck, animal, snake);

    }

    static void makeVoices(Animal... animals) {
        for (Animal animal : animals) {
            animal.speak();
        }
    }

    static void makeVoices(Cat[] cats, Dog[] dogs, Duck[] ducks) {

    }

    /*static void makeVoices(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal; // downcast
                cat.speak();
            }
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.speak();
            }
            if (animal instanceof Duck) {
                Duck duck = (Duck) animal;
                duck.speak();
            }
        }
    }*/
}
