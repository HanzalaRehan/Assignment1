# Library Management System

This Java application is a simple library management system that allows users to add books and users, borrow and return books, display all books, and search for books by their ID. 

## Getting Started

To run this application, you need to have Java installed on your machine. You can compile and run the `Main.java` file using any Java IDE or from the command line.

## Functionality

### Book Class

- Represents a book with attributes such as title, author, genre, availability, and reader.
- Provides methods to retrieve book details, issue and return books, and check availability.

### User Class

- Represents a library user with attributes such as name, contact info, and borrowed books.
- Provides methods to retrieve user details, borrow and return books.

### Library Class

- Manages a collection of books and users.
- Allows adding books and users to the library.
- Enables checking out and returning books.
- Provides methods to search for books by name or ID.

### Main Class

- Implements the main menu and user interface for interacting with the library.
- Allows users to add books and users, borrow and return books, display all books, and search for books.

## Usage

1. Compile all `.java` files.
2. Run the `Main.java` file.
3. Follow the on-screen prompts to interact with the library management system.

## Example

```java
// Example of adding a book
lib.addBook("The Great Gatsby", "F. Scott Fitzgerald", "Classic");

// Example of borrowing a book
lib.checkoutBook(bookID, userID);

// Example of returning a book
lib.returnBook(bookId, userId);

// Example of searching for a book by ID
Book book = lib.searchById(Id);
