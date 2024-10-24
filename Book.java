class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }
    // getters, setters
}

class Library {
    private String name;
    private List<Book> books;

    public Library(String name, List<Book> books) {
        this.name = name;
        this.books = books;
    }
    // getters, setters
}

public class AggregationExample {
    public static void main(String[] args) {
        Book book1 = new Book("1984");
        Book book2 = new Book("To Kill a Mockingbird");
        List<Book> books = Arrays.asList(book1, book2);
        Library library = new Library("Central Library", books);
        // Aggregation relationship
    }
}