package library;

public interface Library {
    void addNewBook(String name, String author, String isbn);
    void viewAllBooks();
    void searchBookByTitle(String title);
}