package org.exapmle
public class Library {
    private String name;// Name of the library
    private String address;// Address of the library
    private Book[] books;// Track number of books in the library
    private int bookCount; // To track the number of books in the library

    // Constructors
    public Library(String name, String address, int capacity) {
        this.name = name;
        this.address = address;
        this.books = new Book[capacity];// Initialize the books array with a given capacity
        this.bookCount = 0; // Initialize bookCount to 0(no books initially)
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Book[] getBooks() {
        return books;
    }

    // Add a book to the library
    public void addBook(Book book) {
        if (bookCount < books.length) {
            books[bookCount] = book;
            bookCount++;

            System.out.println("Book added: " + book.getTitle());
        } else {
            System.out.println("Library is full. Cannot add more books. ");
        }
    }

    // Display library details
    public void displayLibraryDetails() {
        System.out.println("Library Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Books in the library: ");
        if (bookCount == 0) {
            System.out.println("No books available. ");
        } else {
            Book book = null;
            for (int i = 0; i < bookCount; i++) {
                book = books[i];
                System.out.println("- " + book.getTitle() + " by " + book.getAuthor());
            }
        }
    }
}
