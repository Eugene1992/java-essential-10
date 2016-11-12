package hw4progect1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by Марина on 01.11.2016.
 */
public class MainApp {
    private static EmployeeDAO dao = new EmployeeArrayDAOimpl();
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
                    String name = scanner.next();
                    System.out.println("Enter salary employee");
                    int sal = scanner.nextInt();
                    dao.add(new Employee(name, sal));
                    break;

                case "2":
                    System.out.println("Enter id employee");
                    int empId = scanner.nextInt();
                    Employee empl = dao.get(empId);
                    System.out.println("Enter name employee");
                    name = scanner.next();
                    System.out.println("Enter salary employee");
                    sal = scanner.nextInt();
                    // TODO: 11.11.2016 make real update
                    Employee[] employees = dao.update(empl, empId);
                    System.out.println(empl);
                    break;

                case "3":
                    System.out.println("Enter id employee");
                    empId = scanner.nextInt();
                    // TODO: 11.11.2016 Do you really need to request name and salary when you want to delete employee?

                    dao.delete(empId);
                    System.out.println("Employee has been delete");
                    break;

                case "4":
                    System.out.println("Enter id employee");
                    empId = scanner.nextInt();
                    Employee employee = dao.get(empId);
                    System.out.printf("%s, %d", employee.getName(), employee.getSal());
                    break;

                case "5":
                    ArrayList<Employee> employ = dao.getAll();
                    if (employ.size() > 0) {
                        for (int i = 0; i < employ.size(); i++) {
                            System.out.println(employ);
                        }
                    } else {
                        // TODO: 11.11.2016 Describe message when employees is empty
                        System.out.println("Employee not detected. Try again later");
                    }
                    break;
            }
        }
    }
}






