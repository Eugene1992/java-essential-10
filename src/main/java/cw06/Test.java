package cw06;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        Employee king = new Employee("Boss", 40, 200000, null);
        Employee simpleEmployee = new Employee("Ivan", 20, 2000, king);

        System.out.println(simpleEmployee.getBoss().getName());
        System.out.println(simpleEmployee.getName());
    }
}
