/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:50 PM
 *  File Name : Library.java
 * */
package definitions;

import java.util.Arrays;

public class Library {
    private Book[] availableBooksInLibrary;

    public Library() {
        this.availableBooksInLibrary = new Book[5];
    }

    public Book[] getAvailableBooksInLibrary() {
        return availableBooksInLibrary;
    }

    public void setAvailableBooksInLibrary(Book[] availableBooksInLibrary) {
        this.availableBooksInLibrary = availableBooksInLibrary;
    }

    /**
     * this method allows us to add book in library.
     *
     * @param newBookName book name.
     */
    public void addNewBookToLibrary(String newBookName) {
        System.out.println("This " + newBookName + " is book added . ");
    }

    /**
     * This method checks if the book is present in the library and returns a book(if present) to be issued by a student.
     *
     * @param bookToBeIssued The book to be issued by a student.
     * @return a book to be issued.
     */
    public Book issueBookFromLibrary(String bookToBeIssued) {
        return null;
    }

    /**
     * This method add the book(issued) to the library which is returned by a student.
     *
     * @param returnedBook The book to be added back to library.
     */
    public void addReturnedBookToLibrary(Book returnedBook) {
        System.out.println("Returned book has been added back to library.");
    }

    @Override
    public String toString() {
        return "Library{" +
                "availableBooksInLibrary=" + Arrays.toString(availableBooksInLibrary) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Library library = (Library) o;
        return Arrays.equals(availableBooksInLibrary, library.availableBooksInLibrary);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(availableBooksInLibrary);
    }
}
