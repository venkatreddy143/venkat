public class Process extends TicketBook {
    int remainingSeats;

    public Process(String userId, String password, int noOfSeats) {
        super(userId, password, noOfSeats);
    }

    public int getRemainingSeats() {
        return remainingSeats;
    }

    public boolean Process(String userId, String password) throws InvalidCredentials {
        this.userId = "1122";
        this.password = "2233";
        int totalAvailableSeats = 150;
        int totalSeats = 0;
        if (userId.equals(getUserId()) && password.equals(getPassword())) {
            System.out.println("Login Successful");
            } else {
            System.out.println("Login Failed Due to Invalid Credentials");
                throw new InvalidCredentials(CheckedException.exception_401.getErrorCode(),
                        CheckedException.exception_401.getMessage());
            }return false;
        }
    }




