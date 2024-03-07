package accessname;


 import project.ProjectDetails;

public class CompanyDetails extends ProjectDetails {
        private String companyName;
        private String companyLocation;

        @Override
        public String toString() {
            return "CompanyDetails{" +
                    "companyName='" + companyName + '\'' +
                    ", companyLocation='" + companyLocation + '\'' +
                    ", projectName='" + projectName + '\'' +
                    ", technology='" + technology + '\'' +
                    '}';
        }
        public CompanyDetails(String projectName, String technology,String companyName,String companyLocation) {
             super(projectName, technology);
             this.companyName =companyName;
             this.companyLocation = companyLocation;

        }
    }

