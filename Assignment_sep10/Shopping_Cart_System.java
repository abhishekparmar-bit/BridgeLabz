package Assignment_sep10;
class Product {
    // Static variable shared by all products
    static double discount = 10.0;  // in percentage

    // Final variable (unique identifier, cannot be changed)
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    // Constructor using 'this' to initialize fields
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;       // 'this' resolves ambiguity
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // Static method to update discount
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "%");
    }

    // Method to calculate final price after discount
    public double calculateFinalPrice() {
        double total = price * quantity;
        double discountAmount = (total * discount) / 100;
        return total - discountAmount;
    }

    // Method to display product details (with instanceof check)
    public void displayProductDetails() {
        if (this instanceof Product) {
            System.out.println("Product ID: " + productID);
            System.out.println("Name: " + productName);
            System.out.println("Price: $" + price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Final Price: $" + calculateFinalPrice());
            System.out.println("---------------------------");
        } else {
            System.out.println("Not a valid Product object!");
        }
    }
}
public class Shopping_Cart_System {
    public static void main(String[] args) {
        // Create product objects
        Product p1 = new Product(1, "Laptop", 800, 1);
        Product p2 = new Product(2, "Headphones", 50, 2);

        // Display product details
        p1.displayProductDetails();
        p2.displayProductDetails();

        // Update discount
        Product.updateDiscount(20);

        // Display again after discount update
        p1.displayProductDetails();
        p2.displayProductDetails();

        // instanceof check with Object reference
        Object obj = new Product(3, "Smartphone", 600, 1);
        if (obj instanceof Product) {
            ((Product) obj).displayProductDetails();
        }
    }
}
