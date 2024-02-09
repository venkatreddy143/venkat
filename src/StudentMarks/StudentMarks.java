package StudentMarks;


public class StudentMarks {
    public boolean isPassed(Subject sub) {
        System.out.println(" from is passed" + sub.name);
        return sub.marks >= 35;

    }


    Student getResult(Student input) {
        if (isPassed(input.marks.telugu)) {
            input.marks.telugu.result = "Pass";
        } else {
            input.marks.telugu.result = "Fail";
        }
        if (isPassed(input.marks.hindi)) {
            input.marks.hindi.result = "Pass";
        } else {
            input.marks.hindi.result = "Fail";
        }
        if (isPassed(input.marks.english)) {
            input.marks.english.result = "Pass";
        } else {
            input.marks.english.result = "Fail";
        }
        if (isPassed(input.marks.maths)) {
            input.marks.maths.result = "Pass";
        } else {
            input.marks.maths.result = "Fail";
        }
        if (isPassed(input.marks.science)) {
            input.marks.science.result = "Pass";
        } else {
            input.marks.science.result = "Fail";
        }
        if (isPassed(input.marks.social)) {
            input.marks.social.result = "Pass";
        } else {
            input.marks.social.result = "Fail";

        }
        if (input.marks.telugu.result.equals("Pass") &&
                input.marks.hindi.result.equals("Pass") &&
                input.marks.english.result.equals("Pass") &&
                input.marks.maths.result.equals("Pass") &&
                input.marks.science.result.equals("Pass") &&
                input.marks.social.result.equals("Pass")) {

        } else {
            input.result = "Fail";
        }
        return input;
    }
     public static void main(String[] args) {

          Subject telugu = new Subject();
          telugu.marks=90;
          telugu.name ="telugu";

          Subject hindi = new Subject();
          hindi.marks=85;
          hindi.name ="hindi";

          Subject english = new Subject();
          english.marks=85;
          english.name ="english";

          Subject maths = new Subject();
          maths.marks=95;
          maths.name ="maths";

          Subject science = new Subject();
          science.marks=85;
          science.name ="science";

          Subject social = new Subject();
          social.marks=70;
          social.name ="social";

         Marks m =new Marks();
         m.telugu=telugu;
         m.hindi=hindi;
         m.english=english;
         m.maths=maths;
         m.science=science;
         m.social=social;

         Student s = new Student();
         s.name = "siva";
         s.fatherName = "ram";
         s.mobileNo = "123456";
         s.dateOfBirth = "10/1/10";
         s.marks =m;

        // Subject su = new Subject();
         StudentMarks sm=new StudentMarks();

         Student latest= sm.getResult(s);
         System.out.println(latest);



         }






    }

