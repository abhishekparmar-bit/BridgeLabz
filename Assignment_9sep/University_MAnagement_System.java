package Assignment_9sep;
class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }

    public void display() {
        System.out.println("Name " + name);
        System.out.println("rollNumber " + rollNumber);
        System.out.println("CGPA " + CGPA);
    }
}
    class PostgraduateStudent extends Student {
        private String Topic;


        public PostgraduateStudent(int rollNumber, String name, double CGPA, String Topic) {
            super(rollNumber, name, CGPA);
            this.Topic = Topic;
        }

        public  void displays(){
            System.out.println(rollNumber+" "+name+" "+getCGPA()+" "+Topic);
        }

    }

public class University_MAnagement_System {
    public static void main(String[] args) {
        Student s1=new Student(101,"Bhim",9.3);
        s1.setCGPA(9.5);
        s1.getCGPA();
        s1.display();

        PostgraduateStudent pg = new PostgraduateStudent(201, "Bob", 9.2, "Artificial Intelligence");
        pg.displays();

    }
}
