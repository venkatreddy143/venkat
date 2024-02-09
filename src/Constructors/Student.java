package Constructors;

public class Student {
    public String name;
    public String fatherName;
    public String dob;
    public String mobileNo;
    public Address address;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", fatherName='" + fatherName + '\'' +
                ", dob='" + dob + '\'' +
                ", mobileNo='" + mobileNo + '\'' +
                ", address=" + address +
                '}';
    }

    public Student(String name, String fatherName, String dob, String mobileNo, Address address) {
        this.name = name;
        this.fatherName = fatherName;
        this.dob = dob;
        this.mobileNo = mobileNo;
        this.address = address;
    }

    public Student(String name, String fatherName, String dob, String mobileNo) {
       this(name,fatherName,dob,mobileNo,new Address());

    }
}
