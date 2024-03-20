package bookmyshow;

public class PhonepayPayment extends Process{

    int accountBalance;
    int otp;

    public PhonepayPayment(String userId, String password, int noOfSeats,int accountBalance,int otp) {
        super(userId, password, noOfSeats);
        this.accountBalance=accountBalance;
        this.otp=otp;
    }

    public int getAccountBalance() {
        return accountBalance;
    }
    public int getOtp() {
        return otp;
    }
}
