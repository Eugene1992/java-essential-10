package hw04;

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

                case 4:{
                    System.out.println("Id");
                    int delId = sc.nextInt();
                    if ( dao.get(delId) != null)
                    System.out.println("Employee name - " + dao.get(delId).name + ", salary - " + dao.get(delId).salary);
                    else System.out.println("Employee - null");
                    break;
                }

                case 5:{
                    Employee[] getAllArr = dao.getAll();

                    for (int i = 0; i < dao.index+1; i++) {
                        if (getAllArr[i]!= null)
                        System.out.println("Employee name - " + getAllArr[i].name + ", salary - " + getAllArr[i].salary);
                        else System.out.println("Employee - null");
                    }
                    break;
                }
            }
        }

    }
}
