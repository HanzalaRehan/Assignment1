/* Desc: User class for Library MS
 * Author: Hanzala B. Rehan
 * Date C:  Mar 4, 2024
 * Date LM: Mar 4, 2024
 */

import java.util.ArrayList;

public class User {
    private static int numberOfUsers = 0;
    private int userID;
    private String name;
    private String contactInfo;
    private int numBorrowedBook = 0;
    private ArrayList<Integer> borrowedBooks = new ArrayList<Integer>();
    public User(String name, String contactInfo) {
        User.numberOfUsers += 1;
        userID = numberOfUsers;
        this.name = name;
        this.contactInfo = contactInfo;
    }
    public int getUserID() {
        return userID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getContactInfo() {
        return contactInfo;
    }
    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }
    public int getNumBorrowedBook() {
        return numBorrowedBook;
    }
    public ArrayList<Integer> getBorrowedBooks() {
        return borrowedBooks;
    }
    public void borrowBook(int bookId) {
        numBorrowedBook += 1;
        borrowedBooks.add(bookId);
    }
    public void returnBook(int bookId) {
        borrowedBooks.remove(Integer.valueOf(bookId));
    }
}
