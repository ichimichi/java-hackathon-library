public class Book {
    private Integer bookIsbnNo;
    private String author;
    private String publisher;

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
}
