package practice;

public class Test {
    public static void main(String[] args) {

        BookingProcess bookingProcess = new BookingProcess();
        CarDetails carDetails = new CarDetails("BMW", "10000");
        BookingDetails bookingDetails = new BookingDetails(1234,"Benz Auto",
                "BMW Bike",4,carDetails);
        bookingProcess.rapidoBooking(bookingDetails);

    }
}

