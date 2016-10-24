package cw01;

/**
 * Created by Evgeniy on 24.10.2016.
 */
public class TestOOP {
    public static void main(String[] args) {
        Employee empOne = new Employee();
        empOne.salary = 10000;
        empOne.name = "Marina";

        Employee empTwo = new Employee();
        empTwo.salary = 40000;
        empTwo.name = "Vadim";

        Employee empThree = new Employee();
        empThree.salary = 30000;
        empThree.name = "Zhenya";

        Employee empFour = new Employee();
        empFour.salary = 50000;

        Employee[] employees = {empOne, empTwo, empThree, empFour};

        System.out.println(getRichestEmployee(employees).name);
    }

    static Employee getRichestEmployee(Employee[] employees) {
        Employee max = employees[0];
        for (Employee employee : employees) {
            if (employee.salary > max.salary) max = employee;
        }
        /*for (int i = 0; i < employees.length; i++) {
            Employee employee = employees[i];
        }*/
        return max;
    }
}
