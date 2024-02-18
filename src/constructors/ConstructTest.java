package constructors;

public class ConstructTest {
    public static void main(String[] args) {

        Address address = new Address();
        address.city = "KPHB";
        address.pinCode = "1234";
        Student student = new Student("venkat", "reddy", "01/01/2010", "123456", address);
        System.out.println("joining Student" + "-"+ student);

        Student examStudent = new Student("venkat", "reddy", "01/01/2010", "123456");
        System.out.println("examStudent" + "-" + examStudent);

    }
}

