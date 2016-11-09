package hw04;

import java.util.ArrayList;

public class EmployeeDAOImpl implements EmployeeDAO {
    ArrayList<Employee> dataStorage = new ArrayList<>();
    static int index = -1;

    @Override
    public void add(Employee e) {
        dataStorage.add(e);
    }

    @Override
    public void update(Employee e, int id) {
        dataStorage.set(id, e);
    }

    @Override
    public void delete(int id) {
        dataStorage.remove(id);
    }

    @Override
    public Employee get(int id) {
        return dataStorage.get(id);
    }

    @Override
    public ArrayList<Employee> getAll() {
        return dataStorage;
    }
}
