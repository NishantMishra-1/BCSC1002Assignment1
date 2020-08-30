/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;


public class Student {
    private String[] studentName;
    private long universityRollNumber;
    private int numberOfBooksIssued;
    private Book[] issuedBooks;

    public Student(String studentName, long universityRollNumber) {
        this.studentName = studentName.split(" ");
        this.universityRollNumber = universityRollNumber;
        this.issuedBooks = new Book[10];
    }


}