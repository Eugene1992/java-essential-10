package cw09.object_methods;

public class FinalizeTest {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Employee ivan = new Employee("Ivan", 23);
            ivan = null;
            System.gc();
        }
    }
}
