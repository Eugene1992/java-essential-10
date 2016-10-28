package cw03.inheritance;

public class Cat extends Animal {
    private String catField;

    public Cat(String name) {
        super(name);
    }

    public String getCatField() {
        return catField;
    }

//    private -> package-private -> protected -> public
    public void speak() {
        System.out.println(name + " said meow!");
    }
}
