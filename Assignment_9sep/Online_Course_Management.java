package Assignment_9sep;
class Course{
    String courseName;
    int duration;
    int fees;
    static String institutename="GLA";

    Course(String courseName,int duration, int fees){
        this.courseName=courseName;
        this.duration=duration;
        this.fees=fees;
    }

    void displayCourseDetails(){
        System.out.println(courseName+" "+duration+" "+fees+" "+Course.institutename);
    }
    void updateInstitutionName(){
        System.out.println(courseName+" "+duration+" "+fees+" "+Course.institutename);
    }
}
public class Online_Course_Management {
    public static void main(String[] args) {
        Course c1=new Course("SIH",3,5000);
        Course c2=new Course("Bsc",3,10000);

        c1.displayCourseDetails();;
        c2.displayCourseDetails();

        c1.institutename="IIT";

        c1.updateInstitutionName();
        c2.updateInstitutionName();
    }
}
