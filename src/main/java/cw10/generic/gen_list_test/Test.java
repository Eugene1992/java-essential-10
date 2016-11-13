package cw10.generic.gen_list_test;

import cw10.eq_hash.Employee;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        ListTest<Employee> listTest1 = new ListTest<>(new ArrayList<>());
        ListTest<String> listTest2 = new ListTest<>(new ArrayList<>());

        List<Employee> employeeList = new ArrayList<>();
        Collections.sort(employeeList);

        print(new Employee("Ivan", 23), 10);
        print(new Object(), 10);
        print("Hello", 10);
        print(100, 10);
    }

    static<E /*extends Number*/> void print(E e, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(e);
        }
    }
}
