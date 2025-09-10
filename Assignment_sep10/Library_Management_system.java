package Assignment_sep10;
class Book {
    // Static variable (shared by all books)
    static String libraryName = "City Central Library";

    // Final variable (unique and unchangeable)
    private final String isbn;
    private String title;
    private String author;

    // Constructor using 'this' to resolve ambiguity
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;       // 'this' distinguishes between parameter and field
        this.title = title;
        this.author = author;
    }

    // Static method to display library name
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }

    // Method to display book details (only if object is instance of Book)
    public void displayBookDetails() {
        if (this instanceof Book) {
            System.out.println("Library: " + libraryName);
            System.out.println("ISBN: " + isbn);
            System.out.println("Title: " + title);
            System.out.println("Author: " + author);
            System.out.println("--------------------------");
        } else {
            System.out.println("Not a valid Book object!");
        }
    }
}
public class Library_Management_system {
    public static void main(String[] args) {
        // Display library name using static method
        Book.displayLibraryName();

        // Create book objects
        Book book1 = new Book("ISBN001", "Java Programming", "James Gosling");
        Book book2 = new Book("ISBN002", "Effective Java", "Joshua Bloch");

        // Display book details
        book1.displayBookDetails();
        book2.displayBookDetails();

        // instanceof check example
        Object obj = new Book("ISBN003", "Clean Code", "Robert C. Martin");
        if (obj instanceof Book) {
            ((Book) obj).displayBookDetails();
        }
    }
}
