package hw4progect1;

import java.util.ArrayList;

/**
 * Created by Марина on 01.11.2016.
 */
public interface EmployeeDAO {

    void add(Employee e);


    Employee get(int id);

    Employee[] update(Employee e, int id);

    void delete(int id);




    ArrayList<Employee> getAll();

}
