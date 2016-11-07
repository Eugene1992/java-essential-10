package cw07.anonymous;

public class Test {
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.move();

        Animal dog = new Animal() {
            public int k;

            @Override
            public void move() {
                System.out.println("Move like a dog..");
                System.out.println(k);
            }

            public int getK() {
                return k;
            }
        };

        System.out.println(new Animal() {
            public int k;

            @Override
            public void move() {
                System.out.println("Move like a dog..");
                System.out.println(k);
            }

            public int getK() {
                return k;
            }
        }.k);

        Cat cat2 = new Cat(){
            @Override
            public void move() {
                System.out.println("Move like a anonymous cat..");
            }
        };
        cat2.move();
    }
}
