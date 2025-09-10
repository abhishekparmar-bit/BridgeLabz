package Assignment_sep10;
class Employee {
    // Static variable shared across all employees
    static String companyName = "Tech Solutions Pvt Ltd";
    static int totalEmployees = 0;

    // Final variable (cannot be changed once assigned)
    private final int id;
    private String name;
    private String designation;

    // Constructor using 'this' to initialize fields
    public Employee(int id, String name, String designation) {
        this.id = id;                  // 'this' resolves ambiguity
        this.name = name;
        this.designation = designation;
        totalEmployees++;              // Increment when a new employee is created
    }

    // Static method to display total number of employees
    public static void displayTotalEmployees() {
        System.out.println("Total Employees in " + companyName + ": " + totalEmployees);
    }

    // Method to display employee details (with instanceof check)
    public void displayEmployeeDetails() {
        if (this instanceof Employee) {
            System.out.println("Company: " + companyName);
            System.out.println("Employee ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Designation: " + designation);
            System.out.println("---------------------------");
        } else {
            System.out.println("Not a valid Employee object!");
        }
    }
}
public class Employee_Management_System {
    public static void main(String[] args) {
        // Create employees
        Employee emp1 = new Employee(101, "Alice", "Software Engineer");
        Employee emp2 = new Employee(102, "Bob", "Data Analyst");

        // Display details
        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        // Show total employees
        Employee.displayTotalEmployees();

        // instanceof check with Object reference
        Object obj = new Employee(103, "Charlie", "Project Manager");
        if (obj instanceof Employee) {
            ((Employee) obj).displayEmployeeDetails();
        }
    }
}
