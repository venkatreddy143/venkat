package ProjectWork;

public class ProjectDetails {
    public String projectName;
    public String software;
     public CompanyDetails companyDetails;

    @Override
    public String toString() {
        return "ProjectDetails{" +
                "projectName='" + projectName + '\'' +
                ", software='" + software + '\'' +
                ", companyDetails=" + companyDetails +
                '}';
    }

    public ProjectDetails(String projectName, String software, CompanyDetails companyDetails) {
         this.projectName = projectName;
         this.software = software;
         this.companyDetails = companyDetails;

     }

         public ProjectDetails(String projectName,String software){
             this(projectName,software,new CompanyDetails());


     }
}
