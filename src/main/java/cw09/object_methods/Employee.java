package cw09.object_methods;

public class Employee implements Cloneable {

    private String name;
    private int age;
    static int count = 0;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow clone
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("I'm die... " + count++);
    }
}
