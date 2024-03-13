/* Desc: Main class for Library MS
 * Author: Hanzala B. Rehan
 * Date C:  Mar 4, 2024
 * Date LM: Mar 5, 2024
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Library lib = new Library();
        boolean playing = true;

        while (playing) {
            displayMenu();
            int choice = in.nextInt();
            in.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter Book Title: ");
                    String title = in.nextLine();
                    System.out.println("Enter Author Name: ");
                    String author = in.nextLine();
                    System.out.println("Enter Genre Name: ");
                    String genre = in.nextLine();
                    lib.addBook(title, author, genre);
                    break;
                case 2:
                    System.out.println("Enter User Name: ");
                    String user = in.nextLine();
                    System.out.println("Enter Contact Number: ");
                    String num = in.nextLine();
                    lib.addUser(user, num);
                    break;
                case 3:
                    displayBooks(lib.getBooks());
                    break;
                case 4:
                    System.out.println("Enter BookID:");
                    int bookID = in.nextInt();
                    System.out.println("Enter UserID:");
                    int userID = in.nextInt();
                    lib.checkoutBook(bookID, userID);
                    break;
                case 5:
                    System.out.println("Enter BookID:");
                    int bookId = in.nextInt();
                    System.out.println("Enter UserID:");
                    int userId = in.nextInt();
                    lib.returnBook(bookId, userId);
                    break;
                case 6:
                    System.out.println("Enter BookID:");
                    int Id = in.nextInt();
                    Book i = lib.searchById(Id);
                    System.out.printf("%-20S %-10S %-10S\n", i.getTitle(), i.getAuthor(), i.getGenre());
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println("Do you wish to continue(Y/N): ");
            char c = in.nextLine().charAt(0);
            if (c == 'n' || c == 'N')
                playing = false;
        }
        in.close();
    }

    private static void displayMenu() {
        System.out.println("[*] Menu: ");
        System.out.println("[1] Add Book.");
        System.out.println("[2] Add User. ");
        System.out.println("[3] Display All Books. ");
        System.out.println("[4] Borrow Book. ");
        System.out.println("[5] Return Book. ");
        System.out.println("[6] Search Book. ");
        System.out.println("Input Choice: ");
    }

    private static void displayBooks(ArrayList<Book> books) {
        System.out.printf("%-20S %-10S %-10S\n", "Title", "Author", "Genre");
        for (Book i : books) {
            System.out.printf("%-20S %-10S %-10S\n", i.getTitle(), i.getAuthor(), i.getGenre());
        }
    }
}
