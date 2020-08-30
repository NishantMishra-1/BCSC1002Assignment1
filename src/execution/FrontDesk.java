/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : FrontDesk.java
 * */
package execution;

import definitions.Book;
import definitions.Library;
import definitions.Student;

import java.util.Scanner;
public class FrontDesk {
    private static final int ISSUE_BOOK_TO_STUDENT = 1;
    private static final int RETURN_ISSUED_BOOK = 2;
    private static final int SHOW_ISSUED_BOOKS = 3;
    private static final int EXIT = 4;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int studentInput;
        Book book1 = new Book("Java A Beginnner's Guide", "Schildt", "2314561UI");
        Book book2 = new Book("Python for Everybody", "Ashok Kamthane", "75464728TR");
        Library library = new Library();
        Student nishant = new Student("Nishant Mishra", 191500512);
        do {
            System.out.println(" -=-=--=-=-Welcome To The Front Desk-=-=--=-=-\n" +
                    "How may I help you today?\n" +
                    "1. Issue a new book for me.\n" +
                    "2. Return a previously issues book for me.\n" +
                    "3. Show me all my issues books.\n" +
                    "4. Exit.");
            System.out.println("Enter your choice: ");
            studentInput = scanner.nextInt();
            scanner.nextLine();
            switch (studentInput) {
                case ISSUE_BOOK_TO_STUDENT:
                    library.addNewBookToLibrary(book1);
                    library.addNewBookToLibrary(book2);
                    System.out.println("Please enter the book name-");
                    String bookName = scanner.nextLine();
                    Book issueBook = library.issueBookFromLibrary(bookName);
                    if (issueBook == null) {
                        nishant.issueBook(issueBook);
                    } else {
                        System.out.println("Cannot issue book.");
                    }
                    break;
                case RETURN_ISSUED_BOOK:
                    System.out.println("Please enter the name of the book to be returned- ");
                    String returnBookName = scanner.nextLine();
                    Book returnBook = nishant.returnIssuedBook(returnBookName);
                    if (returnBook == null) {
                        library.addReturnedBookToLibrary(returnBook);
                    } else {
                        System.out.println("Cannot return book.");
                    }
                    break;
                case SHOW_ISSUED_BOOKS:
                    Book[] issuedBooks = nishant.getIssuedBooks();
                    for (Book issuedBook : issuedBooks) {
                        System.out.println(issuedBook);
                    }
                    break;
                default:
                    System.out.println("Please enter correct choice");
            }
        } while (studentInput != EXIT);
        scanner.close();
    }
}