package cw09.object_methods;

public class MyClass {
    public static void main(String[] args) {
        Employee ivan = new Employee("Ivan", 23);
        System.out.println(ivan);

        Class ivanClass = ivan.getClass();
        System.out.println(ivanClass.getName());
        System.out.println(ivanClass.getSimpleName());

        Object someEmployee = new Employee("Sergey", 23);

        if (someEmployee instanceof Employee) {
            Employee employee = (Employee) someEmployee;
        }

        if (checkType(someEmployee, "Employee")) {
            Employee employee = (Employee) someEmployee;
        }

    }

    public static boolean checkType(Object object, String className){
        if (object.getClass().getSimpleName().equals(className)) return true;
        return false;
    }

}
