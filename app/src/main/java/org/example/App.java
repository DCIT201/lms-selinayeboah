/*
 * This should be your main class where all your objects will be created
 */
package org.example;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        // Create books with language attribute
        Book book1 = new Book("1984", "George Orwell", "English");
        Book book2 = new Book("The Catcher in the Rye", "J.D. Salinger", "English");
        Book book3 = new Book("Le Petit Prince", "Antoine de Saint-Exupéry", "French");
        //Display a book deatails
        System.out.println(book1.toString());

        // Create library with a capacity of 3 books
        Library library = new Library("Maths Library", "Maths department, 1st floor", 3 );
        // Add books to the library
        library.addBook(new Book("Success Buttons", "David O Oyedepo", "English"));
        library.addBook(new Book("Calculus 2", "Selina Yeboah", "Spanish"));
        library.addBook(new Book("1984", "George Orwell", "English"));
        // Attempt to add another book(exceeds capacity)
        library.addBook(new Book("Le Petit Prince", "Antoine de Saint-Exupéry", "French"));
        //Display library details
        library.displayLibraryDetails();

        // Create a patron
        Patron patron = new Patron("Priscilla Asamoah", "22045");
        // Display patron's details
        patron.displayPatronDetaiils();
        // Patron borrows a book
        patron.borrowBook(book2);

        // Create a patron
        Patron patron2 = new Patron("Roselyn", "22235");
        // Display patron's details
        patron2.displayPatronDetaiils();
        // Patron borrows a book
        patron.borrowBook(book3);
    }
}
