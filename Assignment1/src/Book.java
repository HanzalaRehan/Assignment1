/* Desc: Book class for Library MS
 * Author: Hanzala B. Rehan
 * Date C:  Mar 4, 2024
 * Date LM: Mar 4, 2024
 */

public class Book {
    // All the attributes for the book are initialized here
    private static int numberOfBooks = 0;
    private int bookId;
    private String title;
    private String author;
    private String genre;
    private boolean availability;
    private int reader;

    public Book(String title, String author, String genre) {
        // Constructor
        Book.numberOfBooks += 1;
        this.bookId = numberOfBooks;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.availability = true;
    }

    // Getter & Setter Methods:
    public int getBookId() {
        return bookId;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public int getReader() {
        return reader;
    }
    public boolean isAvailable(){
        return availability;
    }
    public void issueBook(int id){
        this.availability = false;
        reader = id;
    }
    public void returnBook(){
        this.availability = true;
        reader = 0;
    }
}
