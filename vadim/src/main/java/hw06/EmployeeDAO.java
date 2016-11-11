package hw06;

import java.util.List;

public interface EmployeeDAO {

    void add(Employee e);

    void update(Employee e, int id);

    void delete(int id);

    Employee get(int id);

    List<Employee> getAll();
}
