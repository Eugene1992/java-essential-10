package hw4progect1;

/**
 * Created by Марина on 01.11.2016.
 */
public interface EmployeeDAO {

    void add(Employee e);
    Employee get (int id);
    void update (Employee e, int id);
    void delete (int id);
    Employee [] getAll(Employee e);







}
