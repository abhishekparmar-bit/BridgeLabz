package Assignment_sep3;
class Book {
    String title;
    String author;
    double price;
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
public class Q3 {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", 499.99);
        b1.displayDetails();
    }
}
