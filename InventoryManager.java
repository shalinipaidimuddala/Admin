import java.util.*;

public class InventoryManager {
    private Map<Integer, Book> inventory;

    public InventoryManager() {
        this.inventory = new HashMap<>();
    }

    public void addBook(Book book) {
        if (inventory.containsKey(book.getId())) {
            Book existingBook = inventory.get(book.getId());
            existingBook.setQuantity(existingBook.getQuantity() + book.getQuantity());
        } else {
            inventory.put(book.getId(), book);
        }
    }

    public void removeBook(int id) {
        if (!inventory.containsKey(id)) {
            throw new BookNotFoundException("Book not found in inventory");
        }
        inventory.remove(id);
    }

    public List<Book> getBooksByAuthor(String author) {
        List<Book> books = new ArrayList<>();
        for (Book book : inventory.values()) {
            if (book.getAuthor().equals(author)) {
                books.add(book);
            }
        }
        return books;
    }

    public double getTotalInventoryValue() {
        double totalValue = 0;
        for (Book book : inventory.values()) {
            totalValue += book.getPrice() * book.getQuantity();
        }
        return totalValue;
    }

    public List<Book> sortBooksByTitle() {
        List<Book> sortedBooks = new ArrayList<>(inventory.values());
        sortedBooks.sort(Comparator.comparing(Book::getTitle));
        return sortedBooks;
    }
}

class Book {
    private int id;
    private String title;
    private String author;
    private double price;
    private int quantity;

    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        (link unavailable) = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String message) {
        super(message);
    }
}


InventoryManagerTest.java


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InventoryManagerTest {
    private InventoryManager inventoryManager;

    @Before
    public void setup() {
        inventoryManager = new InventoryManager();
    }

    @Test
    public void testAddBook() {
        Book book = new Book(1, "Book Title", "Author Name", 10.99, 5);
        inventoryManager.addBook(book);
        assertEquals(1, inventoryManager.inventory.size());
    }

    @Test
    public void testAddExistingBook() {
        Book book = new Book(1, "Book Title", "Author Name", 10.99, 5);
        inventoryManager.addBook(book);
        book = new Book(1, "Book Title", "Author Name", 10.99, 3);
        inventoryManager.addBook(book);
        assertEquals(1, inventoryManager.inventory.size());
        assertEquals(8, inventoryManager.inventory.get(1).getQuantity());
    }

    @Test
    public void testRemoveBook() {
        Book book = new Book(1, "Book Title", "Author Name", 10.99, 5);
        inventoryManager.addBook(book);
        inventoryManager.removeBook(1);
        assertEquals(0, inventoryManager.inventory.size());
    }

    @Test(expected = BookNotFoundException.class)
    public void testRemoveNonExistentBook() {
        inventoryManager.removeBook(1);
    }

    @Test
    public void testGetBooksByAuthor() {
        Book book1 = new Book(1, "Book Title", "Author Name", 10.99, 5);
        Book book2 = new Book(2, "Another Book", "Author Name", 12.99, 3);
        Book book3 = new Book(3, "Different Author", "Other Author", 9.99, 2);
        inventoryManager.addBook(book1);
        inventoryManager.addBook(book2);
        inventoryManager.addBook(book3);
        List<Book> books = inventoryManager.getBooksByAuthor("Author Name");
        assertEquals(2, books.size());
    }

    @Test
    public void testGetBooksByAuthor_NoBooks() {
        List<Book> books = inventoryManager.getBooksByAuthor("Author Name");
        assertEquals(0, books.size());
    }

    @Test
    public void testGetTotalInventoryValue() {
        Book book1 = new Book(1
