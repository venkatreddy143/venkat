package projectwork;

public class CompanyDetails {
    public String companyName;
    public String companyLocation;

    @Override
    public String   toString() {
        return "CompanyDetails{" +
                "companyName='" + companyName + '\'' +
                ", companyLocation='" + companyLocation + '\'' +
                '}';
    }

    public CompanyDetails(){
        companyName="neoteric";
        companyLocation="Hyderabad";
    }
}
