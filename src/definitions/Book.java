/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

import java.util.Objects;

public class Book() {
    private String bookName;
    private String authorName;
    private String ISBNNumberOfBook;


    public Book(String bookName, String authorName, String ISBNNumberOfBook) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBNNumberOfBook = ISBNNumberOfBook;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookISBNNumber() {
        return ISBNNumberOfBook;
    }

    public void setBookISBNNumber(String bookISBNNumber) {
        this.ISBNNumberOfBook = ISBNNumberOfBook;
    }

    @Override
    public String toString() {
        return "Name of book- \n" + getBookName() + "Author of book- \n" + getAuthorName() + "Book ISBN number: \n" + getBookISBNNumber();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(getBookName(), book.getBookName()) &&
                Objects.equals(getAuthorName(), book.getAuthorName()) &&
                Objects.equals(ISBNNumberOfBook, book.ISBNNumberOfBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBookName(), getAuthorName(), ISBNNumberOfBook);
    }
}






