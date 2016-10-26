package cw02.encapsulation;

public class Test {
    public static void main(String[] args) throws Exception {
        Employee marina = new Employee("Marina", 12, 10000);
        Employee ivan = new Employee("Ivan", 12);
        /*employee.setName("Marina");
        employee.setAge(-12);
        employee.setSalary(10000);*/

        marina.say("Hello");
        marina.scream("Auuch");

        System.out.println(marina.getName());
        System.out.println(marina.getAge());
        System.out.println(marina.getSalary());

        marina.run();
        ivan.run();

        System.out.println(Employee.getPlanet());
    }
}
