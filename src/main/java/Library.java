import java.util.List;

public class Library {
    private String libraryName;
    private Address address;
    String registerNumber;
    List<Book> books;

    public Library(String libraryName, Address address, String registerNumber, List<Book> books) {
        this.libraryName = libraryName;
        this.address = address;
        this.registerNumber = registerNumber;
        this.books = books;
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

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
