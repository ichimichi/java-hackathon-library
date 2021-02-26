import java.util.List;

public class MemberAccount {
    private Integer accountNo;
    private List<BorrowedBookInfo> borrowed;

    public MemberAccount(Integer accountNo, List<BorrowedBookInfo> borrowed) {
        this.accountNo = accountNo;
        this.borrowed = borrowed;
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

    public void setBorrowed(List<BorrowedBookInfo> borrowed) {
        this.borrowed = borrowed;
    }
}
