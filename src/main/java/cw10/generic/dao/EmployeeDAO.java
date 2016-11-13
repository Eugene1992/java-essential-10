package cw10.generic.dao;

import cw04.ex.Employee;

public interface EmployeeDAO {

    void add(Employee employee);

    Employee get(int id);

    Employee[] getAll();

    void update(int id, Employee employee);

    void delete(int id);
}
