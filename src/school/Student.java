package school;

public class Student {
        public String name;
        public String fatherName;
        public String mobileNo;
        public String dateOfBirth;

        @Override
        public String toString() {
                return "Student{" +
                        "name='" + name + '\'' +
                        ", fatherName='" + fatherName + '\'' +
                        ", mobileNo='" + mobileNo + '\'' +
                        ", dateOfBirth='" + dateOfBirth + '\'' +
                        ", studentAddress=" + studentAddress +
                        '}';
        }

        public StudentAddress studentAddress;





}
