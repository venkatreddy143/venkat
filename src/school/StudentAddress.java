package school;

public class StudentAddress {
    public String city;
    public String town;
    public String doorNo;

    @Override
    public String toString() {
        return "StudentAddress{" +
                "city='" + city + '\'' +
                ", town='" + town + '\'' +
                ", doorNo='" + doorNo + '\'' +
                ", pinCode=" + pinCode +
                '}';
    }

    public int pinCode;

}
