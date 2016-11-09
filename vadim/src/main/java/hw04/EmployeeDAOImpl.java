package hw04;

public class EmployeeDAOImpl implements EmployeeDAO {

    Employee[] dataStorage = new Employee[10];

    static int index = -1;

    @Override
    public void add(Employee e) {
        index++;
        if (index > dataStorage.length) {
            int newId = dataStorage.length * 2;
            Employee[] dataStorageNew = new Employee[newId];
            System.arraycopy(dataStorage, 0, dataStorageNew, 0, dataStorage.length);
            dataStorage = dataStorageNew;
        }
        dataStorage[index] = e;
    }

    @Override
    public void update(Employee e, int id) {
        dataStorage[id] = e;
    }

    @Override
    public void delete(int id) {
        dataStorage[id] = null;
    }

    @Override
    public Employee get(int id) {
        return dataStorage[id];
    }

    @Override
    public Employee[] getAll() {
        return dataStorage;
    }
}
