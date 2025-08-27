package Aug_26;

public class Q6 {
    static void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 0 and 150. Given: " + age);
        }
        System.out.println("Valid age: " + age);
    }

    public static void main(String[] args) {
        try {
            // Passing invalid argument
            setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException!");
            e.printStackTrace();
        }

        try {
            // Another invalid case
            setAge(200);
        } catch (IllegalArgumentException e) {
            System.out.println("\nCaught another IllegalArgumentException!");
            e.printStackTrace();
        }

        // Valid case
        setAge(25);

        System.out.println("\nProgram continues after handling exceptions...");
    }
}
