package hw4progect1;

import java.util.ArrayList;

/**
 * Created by Марина on 09.11.2016.
 */
public class EmployeeArrayDAOimpl implements EmployeeDAO {
    ArrayList<Employee> StorageEmployee = new ArrayList<>();

    @Override
    public void add(Employee e) {
        StorageEmployee.add(e);
    }

    @Override
    public Employee get(int id) {
        return StorageEmployee.get(id);
    }

    @Override
    public void update(Employee e, int id) {
        StorageEmployee.set(id, e);
    }

    @Override
    public void delete(int id) {
        StorageEmployee.remove(id);
    }

    @Override
    public ArrayList<Employee> getAll() {
        return StorageEmployee;
    }

}

