public class Process extends TicketBook {
    int remainingSeats;

    public Process(String userId, String password, int noOfSeats) {
        super(userId, password, noOfSeats);
    }

    public int getRemainingSeats() {
        return remainingSeats;
    }

    public int Process(String userId, String password) throws InvalidCredentials {
        this.userId = "1122";
        this.password = "2233";
        int totalAvailableSeats = 150;
        int totalSeats = 0;
        if (userId.equals(getUserId()) && password.equals(getPassword())) {
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
                        + noOfSeats+" = "+totalSeats);
                throw new InvalidCredentials(CheckedException.exception_401.getErrorCode(),
                        CheckedException.exception_401.getMessage());
            }return remainingSeats;
        }
    }




