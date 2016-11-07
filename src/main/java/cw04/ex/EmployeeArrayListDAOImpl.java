package cw04.ex;

import java.util.ArrayList;

public class EmployeeArrayListDAOImpl implements EmployeeDAO {

    private static ArrayList<Employee> dataStorage = new ArrayList<>();

    @Override
    public void add(Employee employee) {
        dataStorage.add(employee);
    }

    @Override
    public Employee get(int id) {
        return dataStorage.get(id);
    }

    @Override
    public Employee[] getAll() {
        Employee[] employees = new Employee[dataStorage.size()];
        return dataStorage.toArray(employees);
    }

    @Override
    public void update(int id, Employee employee) {
        dataStorage.set(id, employee);
    }

    @Override
    public void delete(int id) {
        dataStorage.remove(id);
    }
}
