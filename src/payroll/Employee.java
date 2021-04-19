package payroll;
import java.util.*;

/**
 * @author: Quang LY
 */
public class Employee implements Comparable{
    //instance data
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private Address address;
    private int employeeID;
    private int deptID;
    private String title;
    private double salary;
    public Employee(String fname, String lname, String phone, Address address,
                    int employeeID, int deptID, String title, double salary) {

        firstName = fname;
        lastName = lname;
        phoneNumber = phone;
        this.address = address;
        this.employeeID = employeeID;
        this.title = title;
        this.salary = salary;
    }



    @Override
    public int compareTo(Object t) {
        Employee emp = (Employee)t;
        if(this.salary>emp.salary)
        {
            return 1;
        }
        else if (this.salary == emp.salary)
        {
            return 0;
        }
        else
        {
            return -1;
        }
    }
}
