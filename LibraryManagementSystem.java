import library.LibraryOperations;
import java.util.Scanner;
import library.Library;

public class LibraryManagementSystem {
    public static void main(String[] args){
        System.out.println("Welcome to the Library Management System!!!");
        Library lib = new LibraryOperations();
        while(true) {
            System.out.println("=========================================================");
            System.out.println("                     MAIN MENU                            ");
            System.out.println("=========================================================");
            System.out.println("1. Add New Book");
            System.out.println("2. View All Books");
            System.out.println("3. Search Book by Title");
            Scanner scanner = new Scanner(System.in);
            System.out.print("Please select an option (1-3): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Adding a New Book:");
                    System.out.print("Enter Book Title: ");
                    String name = scanner.next();
                    System.out.print("Enter Book Author: ");
                    String author = scanner.next();
                    System.out.print("Enter Book ISBN: ");
                    String isbn = scanner.next();
                    lib.addNewBook(name, author, isbn);
                    break;
                case 2:
                    lib.viewAllBooks();
                    break;
                case 3:
                    System.out.print("Enter the title of the book to search: ");
                    String search_text = scanner.next();

                    lib.searchBookByTitle(search_text);
                    break;
                default:
                    System.out.println("Invalid choice. Exiting the system.");
                    System.exit(0);
                    break;
            }
        }
    }
}