package projectwork;

public class ProjectTest {
    public static void main(String[] args) {
        CompanyDetails end=new CompanyDetails();
        end.companyName= "Infosys";
        end.companyLocation="Pune";
        ProjectDetails hospital=new ProjectDetails("Hospital Management","FrontEnd",end);
        System.out.println("Front End:"+"-->"+hospital);
        ProjectDetails hospital1=new ProjectDetails("Hospital Management","BackEnd");
        System.out.println("Back End:"+"-->  "+hospital1);
    }
}
