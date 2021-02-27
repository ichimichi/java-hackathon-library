
Identify the nouns and noun phrases from the problem statement

|Nouns and NounPhrases|
|----|
|com.stackroute.library.model.Book|
|com.stackroute.library.model.Library|
|com.stackroute.library.model.Member - Information about a member|
|com.stackroute.library.model.Address - address can be seperated|
|com.stackroute.library.model.MemberAccount - library account information|

These are the candidate classes. Now design the attributes for each of them. 

Note that to link a member to an account, the relationship is that a member has a member account, so design accordingly,


    class com.stackroute.library.model.Book
    {
        int bookIsbnNo;
        String author;
        String publisher;
       
    }

    class com.stackroute.library.model.Library
    {
        String libraryName;
        com.stackroute.library.model.Address address; // the address of the library
        String registerNumber;
        com.stackroute.library.model.Book[] books;// A library has books
    }

    class com.stackroute.library.model.Member
    {
        int memberId;
        String name;
        com.stackroute.library.model.Address address; // the address of a member
        com.stackroute.library.model.MemberAccount memberAccount; // A member has an account
    }

    class com.stackroute.library.model.Address
    {
        int no;
        String streetName;
        String city;
        String state;
        long pinCode;
    }


    class com.stackroute.library.model.MemberAccount
    {
        int accountNo;
        com.stackroute.library.model.BorrowedBookInfo[] borrowed;
        // a member can borrow 5 books at a time thus the array /// to store information
    }

    class com.stackroute.library.model.BorrowedBookInfo
    {
        com.stackroute.library.model.Book book;
        LocalDate borrowedDate;
        LocalDate dueDate;
    }

Now that the classes are designed, we need to identify the behaviour of the classes.

In order to identify the behaviour, identify the *verb phrases* i.e. What can each class do?

com.stackroute.library.model.Library - can lend books, collect the returned books
- lendBooks()
- collectDue()

com.stackroute.library.model.Member - can open a library account
- openAnAccount() 

com.stackroute.library.model.MemberAccount - from an account can borrow books, return books and pay dues.
- borrowBooks()
- returnBooks()
- payDues()


Use Interfaces based on need

