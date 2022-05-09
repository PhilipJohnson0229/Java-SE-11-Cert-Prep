package com.philipJohnson;

public class PublishedWork {
    private String title;
    private String author;

    // default constructor
    public PublishedWork() {
        this.title = "no title";
        this.author = "no name";
    }

    // overloaded constructor
    public PublishedWork(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // accessors
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
}
