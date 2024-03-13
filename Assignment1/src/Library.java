/* Desc: Library class for Library MS
 * Author: Hanzala B. Rehan
 * Date C:  Mar 4, 2024
 * Date LM: Mar 4, 2024
 */

import java.util.ArrayList;

public class Library {
    private ArrayList<Book> Books = new ArrayList<Book>();
    private ArrayList<User> Users = new ArrayList<User>();

    public ArrayList<Book> getBooks() {
        return Books;
    }
    public void addBook(String name, String author, String genre) {
        Book newBook = new Book(name, author, genre);
        Books.add(newBook);
    }
    public void addUser(String name, String ContactInfo) {
        User newUser = new User(name, ContactInfo);
        Users.add(newUser);
    }
    public void checkoutBook(int bookId, int userId) {
        Book bookTBI = null;
        User userTI = null;
        for(Book i: Books){
            if (i.getBookId() == bookId){
                bookTBI = i;
                break;
            }
        }
        for(User i: Users){
            if (i.getUserID() == userId){
                userTI = i;
                break;
            }
        }
        if (bookTBI.isAvailable() && userTI.getNumBorrowedBook() < 5){
            userTI.borrowBook(bookId);
            bookTBI.issueBook(userId);
        }
    }
    public void returnBook(int bookId, int userId){
        Book bookTBI = null;
        User userTI = null;
        for(Book i: Books){
            if (i.getBookId() == bookId){
                bookTBI = i;
                break;
            }
        }
        for(User i: Users){
            if (i.getUserID() == userId){
                userTI = i;
                break;
            }
        }
        userTI.returnBook(bookId);
        bookTBI.returnBook();
    }
    public Book searchByName(String name){
        for (Book i: Books){
            if (i.getTitle() == name){
                return i;
            }
        }
        return null;
    }
    public Book searchById(int Id){
        for (Book i: Books){
            if (i.getBookId() == Id){
                return i;
            }
        }
        return null;
    }
}
