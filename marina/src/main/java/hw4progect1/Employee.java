package hw4progect1;

/**
 * Created by Марина on 04.11.2016.
 */
public class Employee {
    private String name;
    private int sal;

    public Employee(String name, int sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public int getSal() {
        return sal;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                '}';
    }
}
