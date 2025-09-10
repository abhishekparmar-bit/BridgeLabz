package Assignment_sep10;
class Product {
    static double discount = 10.0; 
    private final int productID;
    private String productName;
    private double price;
    private int quantity;
    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;  
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.println("Discount updated to " + discount + "%");
    }
    public double calculateFinalPrice() {
        double total = price * quantity;
        double discountAmount = (total * discount) / 100;
        return total - discountAmount;
    }
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
        Product p1 = new Product(1, "Laptop", 800, 1);
        Product p2 = new Product(2, "Headphones", 50, 2);
        p1.displayProductDetails();
        p2.displayProductDetails();
        
        Product.updateDiscount(20);
        
        p1.displayProductDetails();
        p2.displayProductDetails();
        Object obj = new Product(3, "Smartphone", 600, 1);
        if (obj instanceof Product) {
            ((Product) obj).displayProductDetails();
        }
    }
}
