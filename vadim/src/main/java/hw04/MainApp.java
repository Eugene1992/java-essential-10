package hw04;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        EmployeeDAOImpl dao = new EmployeeDAOImpl();

        Scanner sc = new Scanner(System.in);
        boolean flag = true;

        while (flag) {
            System.out.println("Сделайте выбоор:\n0) Выход.\n1) Добави1ть.\n2) Обновить.\n3) Удалить.\n4) Просмотреть по id.\n5) Просмотреть все.");
            int select = sc.nextInt();
            switch (select) {
                case 0:
                    flag = false;
                    break;
                case 1: {
                    System.out.println("Имя");
                    String newName = sc.next();
                    System.out.println("Зарплата");
                    int newSalary = sc.nextInt();
                    dao.add(new Employee(newName, newSalary));
                    break;
                }

                case 2: {
                    System.out.println("Id");
                    int reId = sc.nextInt();
                    System.out.println("Имя");
                    String reName = sc.next();
                    System.out.println("Зарплата");
                    int reSalary = sc.nextInt();
                    dao.update(new Employee(reName, reSalary), reId);
                    break;
                }

                case 3: {
                    System.out.println("Id");
                    int delId = sc.nextInt();
                    dao.delete(delId);
                    break;
                }

                case 4: {
                    System.out.println("Id");
                    int delId = sc.nextInt();
                    if (dao.get(delId) != null)
                        System.out.println("Employee name - " + dao.get(delId).getName() + ", salary - " + dao.get(delId).getSalary());
                    else System.out.println("Employee - null");
                    break;
                }

                case 5: {

                    ArrayList<Employee> getAllArr = dao.getAll();
//                    System.out.println(dao.getAll());

                    for (Employee oneEmployee : getAllArr) {
                        if (oneEmployee != null)
                            System.out.println("Employee name - " + oneEmployee.getName() + ", salary - " + oneEmployee.getSalary());
                        else System.out.println("Employee - null");
                    }
                    break;
                }
            }
        }

    }
}
