package hw4progect1;

import java.util.Scanner;

/**
 * Created by Марина on 01.11.2016.
 */
public class MainApp {
    private static EmployeeDAO dao = new EmployeeDAOimpl();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        start();
    }

    public static void start() {
        boolean exit = false;
        while (!exit) {
            System.out.println("\nEnter: " +
                    "\n 1 - to add employee, " +
                    "\n 2 - to update employee, " +
                    "\n 3 - to delete employee," +
                    "\n 4 - to get one employee, " +
                    "\n 5 - to get all employee  ");

            String choice = scanner.next();
            if (choice.equals("exit")) {
                exit = true;
                continue;
            }
            switch (choice) {
                case "1":
                    System.out.println("Enter name employee");
                    String name = scanner.nextLine();
                    System.out.println("Enter salary employee");
                    int sal = scanner.nextInt();
                    dao.add(new Employee(name, sal));
                    break;

                case "2":
                    System.out.println("Enter id employee");
                    int empId = scanner.nextInt();
                    Employee empl = dao.get(empId);
                    dao.update(empl, empId);
                    System.out.println(empl);
                    break;

                case "3":
                    System.out.println("Enter id employee");
                    empId = scanner.nextInt();
                    System.out.println("Enter name employee");
                    name = scanner.nextLine();
                    System.out.println("Enter salary employee");
                    sal = scanner.nextInt();
                    dao.delete(empId);
                    System.out.println("Employee has been delete");
                    break;

                case "4":
                    System.out.println("Enter id employee");
                    empId = scanner.nextInt();
                    dao.get(empId);
                    System.out.println("%s, %d");
                    // TODO: name, sal
                    break;

                case "5":
                    Employee[] employees = dao.getAll();
                    if (employees.length > 0)  {
                        for (int i = 0; i < employees.length; i++){
                            System.out.println(employees);
                        }// TODO: else
                           {
                            System.out.println("Try again");
                        }
                        break;
                    }
            }
        }
    }


}



