package cw10.eq_hash;

public class EqualsTest {
    public static void main(String[] args) {
        Employee ivan1 = new Employee("Ivan", 23);
        Employee ivan2 = new Employee("Ivan", 23);

        System.out.println(ivan1.equals(ivan2));
    }
}
