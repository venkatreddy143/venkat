package school;

public class Student2Test {
    Student1 getSchoolName(Student1 stud) {
        stud.schoolname = "St.Anns";

        return stud;
    }

    Student1 getSchoolNameDeepClone(Student1 stud) {

        Student1 clonedStudent = new Student1();
        clonedStudent.name=stud.name;
        clonedStudent.fatherName=stud.fatherName;
        clonedStudent.mobileNo=stud.mobileNo;
        clonedStudent.dateOfBirth=stud.dateOfBirth;
        clonedStudent.schoolname = "St.Jones";

        return clonedStudent;
    }

        public static void main (String[]args){
            Student2Test test2 = new Student2Test();
            Student1 s1 = new Student1();
            s1.name = "siva";
            s1.fatherName = "ram";
            s1.mobileNo = "123456";
            s1.dateOfBirth = "10/1/10";

            Student1 latest = test2.getSchoolNameDeepClone(s1);
            System.out.println(s1.name + " -" + latest.schoolname);
            System.out.println(s1.schoolname);
            System.out.println(s1.hashCode());


        }

    }

