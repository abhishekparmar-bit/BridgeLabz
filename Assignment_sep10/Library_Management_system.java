package Assignment_sep10;
class Book {
    static String libraryName = "City Central Library";
    private final String isbn;
    private String title;
    private String author;
    public Book(String isbn, String title, String author) {
        this.isbn = isbn;       // 'this' distinguishes between parameter and field
        this.title = title;
        this.author = author;
    }
    public static void displayLibraryName() {
        System.out.println("Library Name: " + libraryName);
    }
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
        Book.displayLibraryName();
        Book book1 = new Book("ISBN001", "Java Programming", "James Gosling");
        Book book2 = new Book("ISBN002", "Effective Java", "Joshua Bloch");
        book1.displayBookDetails();
        book2.displayBookDetails();

        Object obj = new Book("ISBN003", "Clean Code", "Robert C. Martin");
        if (obj instanceof Book) {
            ((Book) obj).displayBookDetails();
        }
    }
}
