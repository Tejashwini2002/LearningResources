
// LibraryManagementSystem 
import java.util.ArrayList;
import java.util.List;

public class Q14_library  {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "J.K. Rowling", "1234", true);
        Book book2 = new Book("The Da Vinci Code", "Dan Brown", "5678", false);

        Library library = new Library();
        library.addBook(book1);
        library.addBook(book2);

        library.borrowBook(book2);
        library.borrowBook(book1);

        library.returnBook(book2);
        library.returnBook(book2);
    }
}

class Book {
    private String title;
    private String author;
    private String ISBN;
    private boolean available;

    public Book(String title, String author, String ISBN, boolean available) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.available = available;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public String getTitle() {
        return title;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println("You have borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Sorry, the book " + book.getTitle() + " is currently not available");
        }
    }

    public void returnBook(Book book) {
        if (!book.isAvailable()) {
            book.setAvailable(true);
            System.out.println("You have returned the book: " + book.getTitle());
        } else {
            System.out.println("The book " + book.getTitle() + " has already been returned or was never borrowed");
        }
    }
}