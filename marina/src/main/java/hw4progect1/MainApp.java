package hw4progect1;

import java.util.Scanner;

/**
 * Created by Марина on 01.11.2016.
 */
//public class MainApp {
//   private static EmployeeDAO empl = new EmployeeDAOimpl();
//   private static Scanner scanner = new Scanner(System.in);
//
//    public static void main(String[] args) {
//        start();
//    }
//    public static void start(){
//        boolean exit = false;
//        while (!exit) {
//            System.out.println("Enter: /n 1 - to add employee, /n 2 - to update employee, /3 - to delete employee," +
//                    " /n 4 - to get one employee, /5 - to get all employee  ");
//        }
//            String choise = scanner.next();
//            if (choise.equals("exit")){
//                exit = true;
//                continue;
//
//        }
//        switch (choise){
//            case "1":
//                System.out.println("Enter name employee");
//                String name = scanner.nextLine();
//                System.out.println("Enter salary employee");
//                int sal = scanner.nextInt();
//                dao.add(new Employee (String name, int sal));
//                System.out.println();
//                break;
//            case "2":
//                System.out.println("Enter id employee");
//                int empId = scanner.nextInt();
//                Employee empl = dao.get(empId);
//                System.out.printf("%s, %d", name, sal );
//                break;
//            case "3":
//                System.out.println("Enter id employee");
//                empId = scanner.nextInt();
//                System.out.println("Enter name employee");
//                name = scanner.nextLine();
//                System.out.println("Enter salary employee");
//                sal = scanner.nextInt();
//                Employee empl = dao.update(name, sal);
//                System.out.println("Employee has been update");
//                break;
//            case "4":
//                System.out.println("Enter id employee");
//                empId = scanner.nextInt();
//                dao.delete(empId);
//                break;
//            case "5":
//                Employee [] employees = dao.getAll();
//                if (employees.length>0){
//                    for (int i = 0; i < employees.length; i++);
//                    System.out.printf("%s, &d", name,sal );
//                }
//                else {
//                    System.out.println("Try again");
//                }
//                break;
//        }
//
//    }
//
//}

