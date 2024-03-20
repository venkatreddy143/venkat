package swiggydelivery;
public class Payment extends Coupons implements SwiggyPayment {
    public Payment(String userId, String password, int noOfBiryani, String biryani, String starters,int noOfStarters,int accountBalance) {
        super(userId, password, noOfBiryani, biryani, starters,noOfStarters);
        this.accountBalance=accountBalance;
    }
    private int accountBalance;
    private double remainingBal;
    @Override
    public boolean swiggypayment() throws CheckedExceptions {
        if (accountBalance >= finalAmount) {
            remainingBal = accountBalance - finalAmount;
            System.out.println("Payment successful. Remaining balance: " + remainingBal);

        } else {
            System.out.println("Payment cancelled. Total amount: " + accountBalance);
            throw new CheckedExceptions(ErrorCode.exception_403.getErrorCode(), ErrorCode.exception_403.getMessage());

        }
        return false;
    }
}
