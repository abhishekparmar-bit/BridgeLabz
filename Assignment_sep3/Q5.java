package Assignment_sep3;
// MobilePhone class
class MobilePhone {
    String brand;
    String model;
    double price;
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}
public class Q5 {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 15", 79999.00);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S23", 69999.00);
        phone1.displayDetails();
        phone2.displayDetails();
    }
}
