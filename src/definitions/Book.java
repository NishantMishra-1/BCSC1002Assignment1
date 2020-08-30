/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Book.java
 * */
package definitions;

public class Book {
    private String bookName;
    private String authorName;
    private String ISBNNumberOfBook;

    public Book(String bookName, String authorName, String ISBNNumberOfBook) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.ISBNNumberOfBook = ISBNNumberOfBook;
    }


}
