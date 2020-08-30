/*  Created by IntelliJ IDEA.
 *  User: Divyansh Bhardwaj (dbc2201)
 *  Date: 21/08/20
 *  Time: 3:49 PM
 *  File Name : Student.java
 * */
package definitions;


import java.util.Arrays;
import java.util.Objects;

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

    public String[] getNameOfStudent() {
        return studentName;
    }

    public void setNameOfStudent(String[] nameOfStudent) {
        this.studentName = nameOfStudent;
    }

    public long getUniversityRollNumber() {
        return universityRollNumber;
    }

    public void setUniversityRollNumber(long universityRollNumber) {
        this.universityRollNumber = universityRollNumber;
    }

    public int getNumberOfBooksIssued() {
        return numberOfBooksIssued;
    }

    public void setNumberOfBooksIssued(int numberOfBooksIssued) {
        this.numberOfBooksIssued = numberOfBooksIssued;
    }

    public Book[] getIssuedBooks() {
        return issuedBooks;
    }

    public void setIssuedBooks(Book[] issuedBooks) {
        this.issuedBooks = issuedBooks;
    }

    /**
     * This method issue book to a student.
     *
     * @param issuedBook book has to be issued to a student.
     */
    public void issueBook(Book issuedBook) {
        System.out.println("Book is issued to student");
    }

    /**
     * This method checks issued book record and returns the issued book back to library
     *
     * @param bookReturn The issued book returned.
     * @return a book to be returned.
     */
    public Book returnIssuedBook(String bookReturn) {
        return null;
    }

    @Override
    public String toString() {
        return "Student Name- " + Arrays.toString(studentName) +
                "  University Roll Number- " + universityRollNumber +
                "  Number Of Books Issued- " + numberOfBooksIssued +
                "  Issued Books- " + Arrays.toString(issuedBooks);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return universityRollNumber == student.universityRollNumber &&
                numberOfBooksIssued == student.numberOfBooksIssued &&
                Arrays.equals(studentName, student.studentName) &&
                Arrays.equals(issuedBooks, student.issuedBooks);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(universityRollNumber, numberOfBooksIssued);
        result = 31 * result + Arrays.hashCode(studentName);
        result = 31 * result + Arrays.hashCode(issuedBooks);
        return result;
    }


}