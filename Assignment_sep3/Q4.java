package Assignment_sep3;
class Item {
    int itemCode;
    String itemName;
    double price;
    public Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Item Details:");
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
    }
    public double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}
public class Q4 {
    public static void main(String[] args) {
        Item item1 = new Item(101, "Laptop", 55000.50);
        item1.displayDetails();
        int quantity = 2;
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: " + item1.calculateTotalCost(quantity));
    }
}
