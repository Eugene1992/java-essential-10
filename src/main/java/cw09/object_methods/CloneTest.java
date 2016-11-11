package cw09.object_methods;

public class CloneTest {
    public static void main(String[] args) {
        Employee ivan = new Employee("Ivan", 23);

        try {
            Employee clone = (Employee) ivan.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
