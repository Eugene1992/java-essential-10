package hw05;

import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
    List<Employee> dataStorage;

    public EmployeeDAOImpl(List<Employee> dataStorage) {
        this.dataStorage = dataStorage;
    }

    static int index = -1;

    @Override
    public void add(Employee e) {
        dataStorage.add(e);
    }

    public void add(int id, Employee e){
        dataStorage.add(id, e);
    }

    public int size(){
        return dataStorage.size();
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
    public List<Employee> getAll() {
        return dataStorage;
    }
}
