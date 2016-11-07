package cw04.ex;

import java.util.Scanner;

public class MainApp {
    private static EmployeeDAO dao = new EmployeeArrayListDAOImpl();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        start();
    }

    public static void start(){
        boolean exit = false;
        System.out.println("Welcome to Employee CRUD 1.0!");
        while (!exit) {
            System.out.println("\nChoose your option or press 'exit' to sign out:" +
                    "\n1) add" +
                    "\n2) get()" +
                    "\n3) update()" +
                    "\n4) delete()" +
                    "\n5) getAll()\n");
            String choice = scanner.next();
            if (choice.equals("exit")) {
                exit = true;
                continue;
            }
            switch (choice) {
                case "1":
                    dao.add(getEmployee());
                    System.out.println("Employee successfully added.");
                break;

                case "2":
                    int empId = getId();
                    Employee currEmp = dao.get(empId);
                    System.out.println(printEmployee(currEmp, empId));
                break;

                case "3":
                    dao.update(getId(), getEmployee());
                    System.out.println("Employee successfully updated.");
                break;

                case "4":
                    dao.delete(getId());
                    System.out.println("Employee successfully deleted.");
                break;

                case "5":
                    Employee[] employees = dao.getAll();
                    if (employees.length > 0) {
                        for (int i = 0; i < employees.length; i++) {
                            System.out.println(printEmployee(employees[i], i));
                        }
                    } else {
                        System.out.println("No employees found. Try it later..");
                    }
                break;

                default:
                    System.out.println("Wrong command.. Try again!\n");
            }
        }
    }

    private static String printEmployee(Employee employee, int id) {
        return String.format("%d %s %d %d\n", id, employee.getName(), employee.getAge(), employee.getSalary());
    }

    private static Employee getEmployee() {
        System.out.println("Enter new Employee name: ");
        String empName = scanner.next();
        System.out.println("Enter new Employee age: ");
        int empAge = scanner.nextInt();
        System.out.println("Enter new Employee salary: ");
        int empSalary = scanner.nextInt();
        return new Employee(empName, empAge, empSalary);
    }

    private static int getId() {
        System.out.println("Enter employee id:");
        return scanner.nextInt();
    }
}
