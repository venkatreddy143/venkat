package swiggydelivery;

public class Orders extends SwiggyLogin {
    public String biryani = "chickenBiryani";
    public int biryaniCost = 500;
    public String starters = "chicken65";
    public int startersCost = 250;
    public int biryanitotalAmount;
    public int startersTotalAmount;
    int noOfBiryani;
    int noOfStarters;
    int totalAmount = 0;

    public int getTotalAmount() {
        return totalAmount;
    }

    public Orders(String userId, String password, int noOfBiryani, String biryani, String starters,int noOfStarters) {
        super(userId, password);
        this.noOfBiryani = noOfBiryani;
        this.biryani = biryani;
        this.starters = starters;
        this.noOfStarters=noOfStarters;
    }

    public boolean order() throws CheckedExceptions {

        if (biryani !=null) {
            biryanitotalAmount = biryaniCost * noOfBiryani;
        }
            if (starters!=null) {
                startersTotalAmount = startersCost * noOfStarters;

                totalAmount = biryanitotalAmount + startersTotalAmount;
                System.out.println("Total Amount: == " + totalAmount + "  total birayani amount : " + biryanitotalAmount
                        + "  starters amount : " + startersTotalAmount);

        }else {
            throw new CheckedExceptions(ErrorCode.exception_402.getErrorCode(),ErrorCode.exception_402.getMessage());
        }return false;
    }
}


