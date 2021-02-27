package com.stackroute.library.model;

import java.util.Objects;

public class Book {
    private Integer bookIsbnNo;
    private String author;
    private String publisher;

    public Book() {

    }

    public Book(Integer bookIsbnNo, String author, String publisher) {
        this.bookIsbnNo = bookIsbnNo;
        this.author = author;
        this.publisher = publisher;
    }

    public Integer getBookIsbnNo() {
        return bookIsbnNo;
    }

    public void setBookIsbnNo(Integer bookIsbnNo) {
        this.bookIsbnNo = bookIsbnNo;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookIsbnNo.equals(book.bookIsbnNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookIsbnNo);
    }
}
