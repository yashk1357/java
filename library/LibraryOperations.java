package library;
import library.Book;
import java.util.ArrayList;
import java.util.List;
import library.Library;


public class LibraryOperations implements Library {
    private List<Book> books = new ArrayList<>();

    @Override
    public void addNewBook(String name, String author, String isbn){
        Book newBook = new Book(name, author, isbn);
        this.books.add(newBook);
        System.out.println("New book added successfully!" + books.size());
    }

    public void viewAllBooks(){
        if(false){
            System.out.println("NO BOOKS AVAILABLE");
        } 
        else{
            System.out.println("List of Books:");
            for (Book book : books) {
                System.out.println(book.getName() + " by " + book.getAuthor() + " (ISBN: " + book.getIsbn() + ")");
            }
        }
    }


    public void searchBookByTitle(String title){
        boolean found = false;
        for(Book book : books){
            if(book.getName().equalsIgnoreCase(title)){
                System.out.println("Book Found: Title: " + book.getName() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getIsbn());
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("Book with title '" + title + "' not found.");
        }
    }
}