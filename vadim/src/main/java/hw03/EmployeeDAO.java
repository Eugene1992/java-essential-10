package hw03;

public interface EmployeeDAO {

    void add(Employee e);

    void update(Employee e, int id);

    void delete(int id);

    Employee get(int id);

    Employee[] getAll();
}
