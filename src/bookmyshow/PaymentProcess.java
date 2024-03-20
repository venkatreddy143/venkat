package bookmyshow;

public class PaymentProcess extends PhonepayPayment {
    int remainingSeats;
    int noOfSeats;

    public PaymentProcess(String userId, String password, int noOfSeats, int accountBalance, int otp) {
        super(userId, password, noOfSeats, accountBalance, otp);
    }

    public int getRemainingSeats() {

        return remainingSeats;
    }

    public boolean PaymentProcess(int accountBalance, int otp, int noOfSeats) {
        this.accountBalance = 1000;
        this.otp = 1234;
        int totalAvailableSeats = 150;
        int totalSeats = 0;
        if (accountBalance == getAccountBalance() && otp == getOtp()) {
            System.out.println("Login Successful");
            if (noOfSeats <= totalAvailableSeats) {
                remainingSeats = totalAvailableSeats - noOfSeats;
                System.out.println("Booking Seats" + "   :    " + noOfSeats);
                System.out.println("remainingSeats" + "  :  " + remainingSeats);
            }

        } else {
            remainingSeats = totalAvailableSeats - noOfSeats;
            System.out.println("After Booking Available Seats" + "  :  " + remainingSeats);
            System.out.println("Hold Seats" + "   :    " + noOfSeats);
            System.out.println("Payment Canceled");
            totalSeats = remainingSeats + noOfSeats;
            System.out.println("After Payment Canceled Available Seats" + " : " + remainingSeats + " + "
                    + noOfSeats + " = " + totalSeats);
            throw new RuntimeException(CheckedException.exception_402.getErrorCode(), CheckedException.exception_402.getMessage());
        }
        return false;
    }
}


