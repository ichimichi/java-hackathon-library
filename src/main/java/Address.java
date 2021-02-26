import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class Address {
    private Integer no;
    private String streetName;
    private String city;
    private String state;
    private Long pinCode;


    public Address(Integer no, String streetName, String city, String state, Long pinCode) {
        this.no = no;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.pinCode = pinCode;
    }


}
