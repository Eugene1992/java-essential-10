package cw03.singleton;

import cw02.encapsulation.Employee;

public class Test {
    public static void main(String[] args) {
        Connection connection1 = Connection.getInstance();
        Connection connection2 = Connection.getInstance();

        System.out.println(connection1 == connection2);

        Employee employee1 = new Employee("Ivan", 23);
        Employee employee2 = new Employee("Ivan", 23);

        System.out.println(employee1 == employee2);
    }
}
