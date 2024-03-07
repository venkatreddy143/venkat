package school;

public class Student1test {
    Student getAddress(Student stud){
        Student local = new Student();
        local.name = stud.name;
        local.fatherName = stud.fatherName;
        local.mobileNo = stud.mobileNo;
        local.dateOfBirth = stud.dateOfBirth;

        StudentAddress sa= new StudentAddress();
        sa.doorNo= "1-23";
        sa.town = "kphb";
        sa.city = "hyd";
        sa.pinCode = 500072;

        local.studentAddress=sa;


        return local;

    }
    public static void main(String[] args) {

        Student1test test = new Student1test();
        Student s = new Student();
        StudentAddress sa= new StudentAddress();

        s.name = "siva";
        s.fatherName = "ram";
        s.mobileNo = "123456";
        s.dateOfBirth = "10/1/10";

       Student latest =test.getAddress(s);
       System.out.println(s.name +"  -  " +latest);



    }
}