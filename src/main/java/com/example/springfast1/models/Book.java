package com.example.springfast1.models;


import java.util.UUID;

public class Book {

    private String id;
    private String title;
    private String author;
    private int publisherYear;

    public Book(String id, String title, String author, int publisherYear) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisherYear = publisherYear;
    }

    public Book(String title, String author, int publisherYear) {
        this(UUID.randomUUID().toString(), title, author, publisherYear);
    }

    public Book() {};


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public int getPublisherYear() {
        return publisherYear;
    }
    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }


}
