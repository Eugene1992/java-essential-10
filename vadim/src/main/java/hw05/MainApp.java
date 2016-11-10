package hw05;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        EmployeeDAOImpl daoArray = new EmployeeDAOImpl(new ArrayList<>());
        EmployeeDAOImpl daoLinked = new EmployeeDAOImpl(new LinkedList<>());

        ResultTableData arrayL = new ResultTableData();
        ResultTableData linkedL = new ResultTableData();
        DataStructure data = new DataStructure();
        Scanner sc = new Scanner(System.in);
        long startTime;
        long endTime;
        int count = 10000;
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoArray.add(new Employee("Hello"));
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            daoLinked.add(new Employee("Hello"));
        }
        endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        //Add test
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {daoArray.add(daoArray.size() / 2, new Employee("Hello"));}
        endTime = System.currentTimeMillis();
        data.setMiddleTime(endTime - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {daoArray.add(0, new Employee("Hello"));}
        endTime = System.currentTimeMillis();
        data.setStartTime(endTime - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {daoArray.add( new Employee("Hello"));}
        endTime = System.currentTimeMillis();
        data.setEndTime(endTime - startTime);

        arrayL.setAddEL(data);
        System.out.println(arrayL.getAddEL().getStartTime());
        System.out.println(arrayL.getAddEL().getMiddleTime());
        System.out.println(arrayL.getAddEL().getEndTime());
        //End add test

        //Add test
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {daoLinked.add(daoLinked.size() / 2, new Employee("Hello"));}
        endTime = System.currentTimeMillis();
        data.setMiddleTime(endTime - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {daoLinked.add(0, new Employee("Hello"));}
        endTime = System.currentTimeMillis();
        data.setStartTime(endTime - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {daoLinked.add( new Employee("Hello"));}
        endTime = System.currentTimeMillis();
        data.setEndTime(endTime - startTime);

        linkedL.setAddEL(data);
        System.out.println(linkedL.getAddEL().getStartTime());
        System.out.println(linkedL.getAddEL().getMiddleTime());
        System.out.println(linkedL.getAddEL().getEndTime());
        //End add test

        //Delete test
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {daoArray.delete(daoArray.size() / 2);}
        endTime = System.currentTimeMillis();
        data.setMiddleTime(endTime - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {daoArray.delete(0);}
        endTime = System.currentTimeMillis();
        data.setStartTime(endTime - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {daoArray.delete( daoArray.size()-1);}
        endTime = System.currentTimeMillis();
        data.setEndTime(endTime - startTime);

        arrayL.setRemoveEl(data);
        //End delete test

        //Delete test
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {daoLinked.delete(daoLinked.size() / 2);}
        endTime = System.currentTimeMillis();
        data.setMiddleTime(endTime - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {daoLinked.delete(0);}
        endTime = System.currentTimeMillis();
        data.setStartTime(endTime - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {daoLinked.delete( daoLinked.size()-1);}
        endTime = System.currentTimeMillis();
        data.setEndTime(endTime - startTime);

        linkedL.setRemoveEl(data);
        //End delete test

        //update test
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {daoArray.update(new Employee("Hello"), daoArray.size() / 2);}
        endTime = System.currentTimeMillis();
        data.setMiddleTime(endTime - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {daoArray.update(new Employee("Hello"), 0);}
        endTime = System.currentTimeMillis();
        data.setStartTime(endTime - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {daoArray.update(new Employee("Hello"), daoArray.size()-1);}
        endTime = System.currentTimeMillis();
        data.setEndTime(endTime - startTime);

        arrayL.setUpdateEl(data);
        //End update test

        //update test
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {daoLinked.update(new Employee("Hello"), daoLinked.size() / 2);}
        endTime = System.currentTimeMillis();
        data.setMiddleTime(endTime - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {daoLinked.update(new Employee("Hello"), 0);}
        endTime = System.currentTimeMillis();
        data.setStartTime(endTime - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {daoLinked.update(new Employee("Hello"), daoLinked.size()-1);}
        endTime = System.currentTimeMillis();
        data.setEndTime(endTime - startTime);

        linkedL.setUpdateEl(data);
        //End update test

        //get test
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {daoArray.get(daoArray.size() / 2);}
        endTime = System.currentTimeMillis();
        data.setMiddleTime(endTime - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {daoArray.get(0);}
        endTime = System.currentTimeMillis();
        data.setStartTime(endTime - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {daoArray.get( daoArray.size()-1);}
        endTime = System.currentTimeMillis();
        data.setEndTime(endTime - startTime);

        arrayL.setGetEl(data);
        //End get test

        //get test
        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {daoLinked.get(daoLinked.size() / 2);}
        endTime = System.currentTimeMillis();
        data.setMiddleTime(endTime - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {daoLinked.get(0);}
        endTime = System.currentTimeMillis();
        data.setStartTime(endTime - startTime);

        startTime = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {daoLinked.get( daoLinked.size()-1);}
        endTime = System.currentTimeMillis();
        data.setEndTime(endTime - startTime);

        linkedL.setGetEl(data);
        //End get test

        System.out.println("ArrayList/Linkedlist");
        System.out.println();
        System.out.println("functions \t\t Start \t Middle \t End");
        System.out.println("add \t\t\t "+arrayL.getAddEL().getStartTime()+"/"+linkedL.getAddEL().getStartTime()+
                " \t "+arrayL.getAddEL().getMiddleTime()+"/"+linkedL.getAddEL().getMiddleTime()+
                " \t "+arrayL.getAddEL().getEndTime()+"/"+linkedL.getAddEL().getEndTime());
        System.out.println("remove \t\t\t "+arrayL.getRemoveEl().getStartTime()+"/"+linkedL.getRemoveEl().getStartTime()+
                " \t "+arrayL.getRemoveEl().getMiddleTime()+"/"+linkedL.getRemoveEl().getMiddleTime()+
                " \t "+arrayL.getRemoveEl().getEndTime()+"/"+linkedL.getRemoveEl().getEndTime());
        System.out.println("update \t\t\t "+arrayL.getUpdateEl().getStartTime()+"/"+linkedL.getUpdateEl().getStartTime()+
                " \t "+arrayL.getUpdateEl().getMiddleTime()+"/"+linkedL.getUpdateEl().getMiddleTime()+
                " \t "+arrayL.getUpdateEl().getEndTime()+"/"+linkedL.getUpdateEl().getEndTime());
        System.out.println("get \t\t\t "+arrayL.getGetEl().getStartTime()+"/"+linkedL.getGetEl().getStartTime()+
                " \t "+arrayL.getGetEl().getMiddleTime()+"/"+linkedL.getGetEl().getMiddleTime()+
                " \t "+arrayL.getGetEl().getEndTime()+"/"+linkedL.getGetEl().getEndTime());

    }
}
