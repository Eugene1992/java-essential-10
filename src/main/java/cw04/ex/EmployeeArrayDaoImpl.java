package cw04.ex;

import java.util.Arrays;

public class EmployeeArrayDaoImpl implements EmployeeDAO {

    private Employee[] dataStorage = new Employee[DEFAULT_CAPACITY];
    private final static int DEFAULT_CAPACITY = 10; // non magic number example !
    private final static int DEFAULT_CAPACITY_SCALE = 2;
    private static int currSize = 0;

    @Override
    public void add(Employee employee) {
        if (currSize + 1 > dataStorage.length) {
            Employee[] tempDataStorage = new Employee[currSize * DEFAULT_CAPACITY_SCALE];
            System.arraycopy(dataStorage, 0, tempDataStorage, 0, dataStorage.length);
            dataStorage = tempDataStorage;
        }
        dataStorage[currSize] = employee;
        currSize++;
    }

    @Override
    public Employee get(int id) {
        checkId(id);
        return dataStorage[id];
    }

    @Override
    public Employee[] getAll() {
//        return dataStorage; // NPE!
        return Arrays.copyOf(dataStorage, currSize);
    }

    @Override
    public void update(int id, Employee employee) {
        checkId(id);
        dataStorage[id] = employee;
    }

    @Override
    public void delete(int id) {
        checkId(id);
        dataStorage[id] = null;
        currSize--;
    }

    private static void checkId(int id) {
        if (id < 0 || id > currSize) {
            System.out.println("Negative index value or out of range.");
            System.exit(0);
        }
    }
}
