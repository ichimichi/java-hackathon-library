package com.stackroute.library;

import com.stackroute.library.model.Address;
import com.stackroute.library.model.Book;
import com.stackroute.library.model.Library;
import com.stackroute.library.model.Member;

public class Main {
    public static void main(String[] args) {
        // initializing a new library
        System.out.println("Creating com.stackroute.library.model.Library");
        Library niceLibrary = new Library();

        // adding books to the library
        niceLibrary.addBook(new Book(1, "APJ Abdul Kalam", "Macmillan"));
        niceLibrary.addBook(new Book(2, "Abhay K", "Hachette com.stackroute.library.model.Address.com.stackroute.library.model.Book Group"));
        niceLibrary.addBook(new Book(3, "William Shakespeare", "Harper Collins"));
        niceLibrary.addBook(new Book(4, "William Shakespeare", "Simon and Schuster"));

        System.out.println("\nBooks List");
        niceLibrary.getBooks().forEach(b -> System.out.println(b.getBookIsbnNo() + " " + b.getAuthor() + " " + b.getPublisher()));

        // removing a book from the library
        niceLibrary.removeBook(2);
        System.out.println("\nBooks List after removal");
        niceLibrary.getBooks().forEach(b -> System.out.println(b.getBookIsbnNo() + " " + b.getAuthor() + " " + b.getPublisher()));

        // initializing and address
        Address myAddress = new Address(122, "Pohkseh", "Shillong", "Meghalaya", 793006L);

        // initializing a member
        Member member = new Member(1, "Laribok Syiemlieh", myAddress);

        System.out.println("\nDoes " + member.getName() + " have an account ?");
        System.out.println(member.getMemberAccount() == null ? "No" : "Yes");

        // opening an account
        System.out.println("\nOpening an account...");
        member.openAnAccount();

        System.out.println("\nOkay Now, Does " + member.getName() + " have an account ?");
        System.out.println(member.getMemberAccount() == null ? "No" : "Yes");

        System.out.println("\nBooks borrowed by " + member.getName());
        member.getMemberAccount().getBorrowed().forEach(b -> System.out.println(b.getBook().getBookIsbnNo() + " " + b.getBook().getAuthor() + " " + b.getBook().getPublisher()));
        System.out.println("...");

        System.out.println("\nBorrowing Books ...");
        member.getMemberAccount().borrowBook(niceLibrary, 1);
        member.getMemberAccount().borrowBook(niceLibrary, 3);
        member.getMemberAccount().borrowBook(niceLibrary, 4);
        member.getMemberAccount().getBorrowed().forEach(b -> System.out.println(b.getBook().getBookIsbnNo() + " " + b.getBook().getAuthor() + " " + b.getBook().getPublisher()));

        // returning a book
        System.out.println("\nReturning a book...");
        member.getMemberAccount().returnBook(niceLibrary, 3);

        System.out.println("\nNow, Books borrowed by " + member.getName());
        member.getMemberAccount().getBorrowed().forEach(b -> System.out.println(b.getBook().getBookIsbnNo() + " " + b.getBook().getAuthor() + " " + b.getBook().getPublisher()));
        System.out.println("...");
    }
}
