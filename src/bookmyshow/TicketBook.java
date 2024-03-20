package bookmyshow;

public class TicketBook extends BookMyShow {
    int noOfSeats;
    public TicketBook(String userId, String password,int noOfSeats) {
        super(userId, password);
        this.noOfSeats=noOfSeats;
    }
}