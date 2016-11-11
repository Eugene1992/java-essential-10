package hw06;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainApp {
    public static void main(String[] args) {
        EmployeeDAOImpl daoArray = new EmployeeDAOImpl(new ArrayList<>());
        EmployeeDAOImpl daoLinked = new EmployeeDAOImpl(new LinkedList<>());

        long startTime;
        long endTime;
        int count = 100000;

        for (int i = 0; i < count; i++) {
            daoArray.add(new Employee("Hello"));
        }
        for (int i = 0; i < count; i++) {
            daoLinked.add(new Employee("Hello"));
        }

        System.out.println("ArrayList/Linkedlist");
        System.out.println();
        System.out.println("functions \t\t Start \t\t\t Middle \t\t End");

        //Add test
        System.out.print("add \t\t\t ");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoArray.add(0, new Employee("Hello"));
        }
        endTime = System.currentTimeMillis();
        System.out.print(endTime - startTime + " / ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoLinked.add(0, new Employee("Hello"));
        }
        endTime = System.currentTimeMillis();
        System.out.print(endTime - startTime + " \t\t ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoArray.add(daoArray.size() / 2, new Employee("Hello"));
        }
        endTime = System.currentTimeMillis();
        System.out.print(endTime - startTime + " / ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoLinked.add(daoLinked.size() / 2, new Employee("Hello"));
        }
        endTime = System.currentTimeMillis();
        System.out.print(endTime - startTime + " \t\t ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoArray.add(new Employee("Hello"));
        }
        endTime = System.currentTimeMillis();
        System.out.print(endTime - startTime + " / ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoLinked.add(new Employee("Hello"));
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        //End add test

        //Delete test
        System.out.print("remove \t\t\t ");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoArray.delete(0);
        }
        endTime = System.currentTimeMillis();
        System.out.print(endTime - startTime + " / ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoLinked.delete(0);
        }
        endTime = System.currentTimeMillis();
        System.out.print(endTime - startTime + " \t\t ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoArray.delete(daoArray.size() / 2);
        }
        endTime = System.currentTimeMillis();
        System.out.print(endTime - startTime + " / ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoLinked.delete(daoLinked.size() / 2);
        }
        endTime = System.currentTimeMillis();
        System.out.print(endTime - startTime + " \t\t ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoArray.delete(daoArray.size() - 1);
        }
        endTime = System.currentTimeMillis();
        System.out.print(endTime - startTime + " / ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoLinked.delete(daoLinked.size() - 1);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        //End delete test

        //update test
        System.out.print("update \t\t\t ");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoArray.update(new Employee("Hello"), 0);
        }
        endTime = System.currentTimeMillis();
        System.out.print(endTime - startTime + " / ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoLinked.update(new Employee("Hello"), 0);
        }
        endTime = System.currentTimeMillis();
        System.out.print(endTime - startTime + " \t\t ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoArray.update(new Employee("Hello"), daoArray.size() / 2);
        }
        endTime = System.currentTimeMillis();
        System.out.print(endTime - startTime + " / ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoLinked.update(new Employee("Hello"), daoLinked.size() / 2);
        }
        endTime = System.currentTimeMillis();
        System.out.print(endTime - startTime + " \t\t ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoArray.update(new Employee("Hello"), daoArray.size() - 1);
        }
        endTime = System.currentTimeMillis();
        System.out.print(endTime - startTime + " / ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoLinked.update(new Employee("Hello"), daoLinked.size() - 1);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        //End update test

        //get test
        System.out.print("get \t\t\t ");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoArray.get(0);
        }
        endTime = System.currentTimeMillis();
        System.out.print(endTime - startTime + " / ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoLinked.get(0);
        }
        endTime = System.currentTimeMillis();
        System.out.print(endTime - startTime + " \t\t ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoArray.get(daoArray.size() / 2);
        }
        endTime = System.currentTimeMillis();
        System.out.print(endTime - startTime + " / ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoLinked.get(daoLinked.size() / 2);
        }
        endTime = System.currentTimeMillis();
        System.out.print(endTime - startTime + " \t\t ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoArray.get(daoArray.size() - 1);
        }
        endTime = System.currentTimeMillis();
        System.out.print(endTime - startTime + " / ");

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoLinked.get(daoLinked.size() - 1);
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        //End get test
    }
}
