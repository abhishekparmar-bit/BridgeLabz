package Assignment_sep10;
class Employee {
    static String companyName = "Tech Solutions Pvt Ltd";
    static int totalEmployees = 0;
    private final int id;
    private String name;
    private String designation;
    public Employee(int id, String name, String designation) {
        this.id = id;                
        this.name = name;
        this.designation = designation;
        totalEmployees++;           
    }
    public static void displayTotalEmployees() {
        System.out.println("Total Employees in " + companyName + ": " + totalEmployees);
    }
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
        Employee emp1 = new Employee(101, "Alice", "Software Engineer");
        Employee emp2 = new Employee(102, "Bob", "Data Analyst");

        emp1.displayEmployeeDetails();
        emp2.displayEmployeeDetails();

        Employee.displayTotalEmployees();

        Object obj = new Employee(103, "Charlie", "Project Manager");
        if (obj instanceof Employee) {
            ((Employee) obj).displayEmployeeDetails();
        }
    }
}
