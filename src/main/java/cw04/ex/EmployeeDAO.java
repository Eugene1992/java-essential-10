package cw04.ex;

public interface EmployeeDAO {

    void add(Employee employee);

    Employee get(int id);

    Employee[] getAll();

    void update(int id, Employee employee);

    void delete(int id);
}
