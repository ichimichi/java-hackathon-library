package com.stackroute.library.model;

import java.util.HashSet;
import java.util.Set;

public class Library {
    private String libraryName;
    private Address address;
    private String registerNumber;
    private Set<Book> books = new HashSet<>();

    public Library() {
    }

    public Library(String libraryName, Address address, String registerNumber) {
        this.libraryName = libraryName;
        this.address = address;
        this.registerNumber = registerNumber;
    }

    public String getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(String libraryName) {
        this.libraryName = libraryName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getRegisterNumber() {
        return registerNumber;
    }

    public void setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void removeBook(Integer isbn) {
        Book book = new Book();
        book.setBookIsbnNo(isbn);
        this.books.remove(book);
    }

    public boolean collectDues(Integer amount) {
        System.out.println("Dues Collected");
        return true;
    }
}
