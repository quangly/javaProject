package payroll;
/**
 *
 * @author Peggy Fisher
 */
public class Payroll {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Address a1 = new Address("123", "South Main Street", "Cleveland", "OH",
                "12345");
        Address a2 = new Address("123", "North Main Street", "Willoughby", "OH",
                "54321");

        Address a3 = null;


        Employee ee1 = new Employee("Peggy", "Fisher", "717-555-1212",a1,
                955123, 003, "Lecturer",45000.00 );
        Employee ee2 = new Employee("Bob", "Fisher", "717-555-1212",a2, 955123,
                003, "Lecturer",45500.00 );

        Employee ee3 = new Employee("Jack", "Handy", "666-555-4444",a3, 955126,
				001, "Lecturer",35500.00 );

		ee1.printEmployee();
		ee2.printEmployee();
		ee3.printEmployee();

    }

}
