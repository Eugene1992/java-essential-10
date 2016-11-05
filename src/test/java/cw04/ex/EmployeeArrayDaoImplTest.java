package cw04.ex;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeArrayDaoImplTest {

    private static EmployeeArrayDaoImpl dao;
    private static Employee testEmployee;

    @BeforeClass
    public static void before() {
        dao = new EmployeeArrayDaoImpl();
        testEmployee = new Employee("Ivan", 23, 10000);
    }

    @Test
    public void addSameNamesTest() {
        dao.add(testEmployee);
        Employee result = dao.get(0);
        Assert.assertEquals("Names of employees are not equal",
                testEmployee.getName(),
                result.getName()
        );
    }

    @Test
    public void addTest() {
        dao.add(testEmployee);
        Employee result = dao.get(0);
        Assert.assertNotNull("Name is null", result.getName());
    }
}
