package org.example
public class Book {

    // This is your working class.
    private String title;
    private String author;
    private String language;

// Constructor
    public Book(String title, String author, String language){
        this.title = title;
        this.author = author;
        this.language = language;
    }

    // Getters
    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getLanguage(){
        return language;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setLanguage(String language) {
        this.language = language;
    }

    // Method to borrow a book
    public void borrowBook() {
        System.out.println("You have borrowed the book: " + title);
    }

    // Method to return a book
    public void returnBook() {
        System.out.println("You have returned the book: " + title);
    }

    public String toString() {
        return "Book{title='" + title + "', author='" + author + "', language='" + language + "'}";
    }
    
}
