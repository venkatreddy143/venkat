package AccessName;


 import project.ProjectDetails;

public class CompanyDetails extends ProjectDetails {
        private String companyName;
        private String companyLocation;

        public void setCompanyName(String companyName) {
            this.companyName = companyName;
        }

        public void setCompanyLocation(String companyLocation) {
            this.companyLocation = companyLocation;
        }

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

