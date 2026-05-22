package bookprogram;

@SuppressWarnings("java:S106")

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        Book book_1 = new Book("Harry porter", "jf tolkens", 2345);
        Book book_2 = new Book("Cinderella", "Bob delan", 6789);
        Book book_3 = new Book("bkllman", "gotham city", 34567);

        book_1.addBookToCollection(book_1);
        book_2.addBookToCollection(book_2);
        book_3.addBookToCollection(book_3);

        book_3.removeBookFromCollection(book_3);

    }
}
