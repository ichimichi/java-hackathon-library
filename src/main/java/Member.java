public class Member {
    private Integer id;
    private String name;
    private Address address;
    MemberAccount memberAccount;

    public Member(Integer id, String name, Address address, MemberAccount memberAccount) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.memberAccount = memberAccount;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public MemberAccount getMemberAccount() {
        return memberAccount;
    }

    public void setMemberAccount(MemberAccount memberAccount) {
        this.memberAccount = memberAccount;
    }
}
