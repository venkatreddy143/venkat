package school;

import Intrest.AmountGive;

import java.util.SortedMap;

public class StudentTest {
    String getRollNo(Student abc){

        return "";
    }
    public static void main(String[] args){

        StudentTest studenttest = new StudentTest();
        Student student1= new Student();
        Student student2= new Student();
        SchoolName schoolName = new SchoolName();


        student1.name = "Charan";
        student1.fatherName = "Ram";
        student1.mobileNo = "12345";
        student1.dateOfBirth = "01/01/2012";


        student2.name = "Ayaan";
        student2.fatherName = "Arjun";
        student2.mobileNo = "123456";
        student2.dateOfBirth = "01/01/2014";

        studenttest.getRollNo(student1);
        studenttest.getRollNo(student2);

        System.out.println(student1.name +" fathername" +"  "+
                student1.fatherName +" =    " + schoolName.schoolName + "->   " + schoolName.address);
        System.out.println(student2.name +" =    " + schoolName.schoolName + "->   " + schoolName.address);




    }

}
