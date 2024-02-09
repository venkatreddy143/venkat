package Constructors;

public class Address {
    public String city;
    public String state;
    public String country;
    public String pinCode;

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", pinCode='" + pinCode + '\'' +
                '}';
    }

    public Address(){
        city="Hyd";
        state="TG";
        country="India";
        pinCode="500072";

    }
}
