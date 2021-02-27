package com.stackroute.library.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class MemberAccount {
    private Integer accountNo;
    private List<BorrowedBookInfo> borrowed;

    MemberAccount() {
        accountNo = new Random().nextInt();
        borrowed = new ArrayList<>();
    }

    public Integer getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(Integer accountNo) {
        this.accountNo = accountNo;
    }

    public List<BorrowedBookInfo> getBorrowed() {
        return borrowed;
    }

    public boolean borrowBook(Library library, Integer isbn) {
        Book book = library.getBooks().stream().
                filter(b -> b.getBookIsbnNo().equals(isbn)).
                collect(Collectors.toList()).get(0);

        BorrowedBookInfo borrowedBookInfo = new BorrowedBookInfo(book, LocalDate.now(), LocalDate.now().plusDays(7));

        if (borrowed.size() < 5) {
            this.borrowed.add(borrowedBookInfo);
            return true;
        }
        return false;
    }

    public void returnBook(Library library, Integer isbn) {
        BorrowedBookInfo borrowedBookInfo = borrowed.stream().filter(b -> b.getBook().getBookIsbnNo().equals(isbn)).collect(Collectors.toList()).get(0);
        if (LocalDate.now().isAfter(borrowedBookInfo.getDueDate())) {
            while (!payDues(library, 100)) {
                System.out.println("waiting...");
            }
            ;
        }
        borrowed = borrowed.stream().filter(b -> !b.getBook().getBookIsbnNo().equals(isbn)).collect(Collectors.toList());
    }

    public boolean payDues(Library library, Integer amount) {
        library.collectDues(amount);
        return true;
    }
}
