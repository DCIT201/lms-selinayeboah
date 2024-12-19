package org.example;
public class Patron {
    private String name;
    private String id;
    private Book borrowedBook; // Patron can only borrow one book

    // Constructor
    public Patron(String name, String id){
        this.name = name;
        this.id = id;
        this.borrowedBook = null;// Initially no book is borrowed
    }
    // Getters
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public Book getBorrowedBook(){
        return borrowedBook;
    }
    //Method to borrow a book
    public void borrowBook(Book book){
        if(borrowedBook == null){
            borrowedBook = book;
        System.out.println(name + " borrowed: " + book.getTitle() + " by " + book.getAuthor());
        }
        else{
            System.out.println(name + " has already borrowed a book: " + borrowedBook.getTitle());
        }
    }
    // Display patron detaiils
    public void displayPatronDetaiils(){
        System.out.println("Patron NAME: " + name);
        System.out.println("Patron ID: " + id);
        if(borrowedBook != null){
            System.out.println("Borrowed Book: " + borrowedBook.getTitle() + " by " + borrowedBook.getAuthor());
        }
        else{
            System.out.println("No book borrowed.");
        }
    }
}
