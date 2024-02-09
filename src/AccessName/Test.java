package AccessName;


    public class Test {
        public static void main(String[] args) {
            CompanyDetails companyDetails= new CompanyDetails("Zomato","Java","TCS","Hyderabad");
            EmployeeDetails employeeDetails = new EmployeeDetails("Venkat","9908",20000,companyDetails);

            System.out.println(employeeDetails);

        }
    }

