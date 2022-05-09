package com.philipJohnson;

// Book.java
// Philip Johnson
// 05/02/22
// represents a book which inherits from a published work

import java.util.Objects;

//extends keyword tells java that this class inherits from the published work base class
public class Book extends PublishedWork
{
    //number of pages
    private int numPages;

    //enum array of integers representing book type
    private enum BookType{ NOTYPE, PAPERBACK, HARDBACK, EBOOK, AUDIO };

    //enum representation value
    public BookType bookType;

    //default constructor
    public  Book()
    {
        //implement overloaded constructor
        this("Unknown","Unknown", 0, BookType.NOTYPE);

    }

    //overloaded constructor
    public Book(String title, String author, int numPages, BookType bookType) {

        super(title, author);
        this.numPages = numPages;
        this.bookType = bookType;
    }

    //accessors
    public int getNumPages() {
        return numPages;
    }

    public BookType getBookType() {
        return bookType;
    }

    //mutators
    public void setNumPages(int numPages) {
        this.numPages = numPages;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    @Override
    public String toString() {
        return "Book{" + getTitle() + ", "
                + getAuthor() + ", " +
                "numPages=" + numPages +
                ", bookType=" + bookType +
                '}';
    }

    //overridden equals method comparing this Book object to object o
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return  getTitle() == book.getTitle() && getAuthor() == book.getAuthor();
    }
}
