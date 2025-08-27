package Aug_26;

public class Q8 { public static void main(String[] args) {
    int[] numbers = {10, 20, 30, 40, 50}; // length = 5 (valid indices 0–4)

    try {
        // Valid access
        System.out.println("Element at index 2: " + numbers[2]);

        // Invalid access (greater than length - 1)
        System.out.println("Element at index 10: " + numbers[10]);
    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("Caught an ArrayIndexOutOfBoundsException!");
        e.printStackTrace();
    }
}
}
