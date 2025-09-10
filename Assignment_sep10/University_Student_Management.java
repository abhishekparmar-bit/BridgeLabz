package Assignment_sep10;
class Student {
    // Static variable (shared across all students)
    static String universityName = "Global University";
    static int totalStudents = 0;

    // Final variable (unique ID for each student, cannot be changed)
    private final int rollNumber;
    private String name;
    private String grade;

    // Constructor using 'this' to initialize fields
    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;   // 'this' resolves ambiguity
        this.name = name;
        this.grade = grade;
        totalStudents++;                // Increase count for each student created
    }

    // Static method to display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students in " + universityName + ": " + totalStudents);
    }

    // Method to update grade (with instanceof check)
    public void updateGrade(String newGrade) {
        if (this instanceof Student) {
            this.grade = newGrade;
            System.out.println("Grade updated for " + name + " to " + grade);
        } else {
            System.out.println("Invalid Student object!");
        }
    }

    // Method to display student details (with instanceof check)
    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
            System.out.println("--------------------------");
        } else {
            System.out.println("Not a valid Student object!");
        }
    }
}
public class University_Student_Management {
        public static void main(String[] args) {
            // Create student objects
            Student s1 = new Student(101, "Alice", "A");
            Student s2 = new Student(102, "Bob", "B");

            // Display student details
            s1.displayStudentDetails();
            s2.displayStudentDetails();

            // Update grade
            s2.updateGrade("A+");

            // Display total students
            Student.displayTotalStudents();

            // instanceof check with Object reference
            Object obj = new Student(103, "Charlie", "B+");
            if (obj instanceof Student) {
                ((Student) obj).displayStudentDetails();
            }
        }
    }

