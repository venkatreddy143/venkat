package AccessName;


    public  class EmployeeDetails {
        private  String name;
        private String mobileNumber;
        private int salary;
        private CompanyDetails company;

        @Override
        public String toString() {
            return "EmployeeDetails{" +
                    "name='" + name + '\'' +
                    ", mobileNumber='" + mobileNumber + '\'' +
                    ", salary=" + salary +
                    ", company=" + company +
                    '}';
        }
        public  EmployeeDetails(String name, String mobileNumber, int salary, CompanyDetails company){
            this.name = name;
            this.mobileNumber= mobileNumber;
            this.salary = salary;
            this.company = company;

        }
        public String getName() {
            return this.name;
        }

        public String getMobileNumber() {
            return this.mobileNumber;
        }

        public int getSalary() {
            return this.salary;
        }

        public CompanyDetails getCompany() {
            return this.company;
        }
    }


