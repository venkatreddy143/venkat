package practice;

public class BookingProcess {
    public String Destination(String pickUpLocation) {
        return pickUpLocation;
    }

    public String Destination(String dropingLocation, String time) {
        return dropingLocation + " " + time;
    }

    public BookingDetails rapidoBooking(BookingDetails bookingDetails) {
        int otp = 1234;
        if (bookingDetails.getOtp() == otp) {
            if (bookingDetails.getNoOfPersons() == 1) {
                System.out.println("Booked =" + bookingDetails.getBike());
            }
            if (bookingDetails.getNoOfPersons() >= 1 && bookingDetails.getNoOfPersons() < 4) {

                System.out.println("Booked= " + bookingDetails.getAuto());
            }
            if (bookingDetails.getNoOfPersons() >= 4) {
                System.out.println("Booked= " + bookingDetails.getCarDetails());
            }
            System.out.println("PickUPLocation=" + Destination("KPHB"));
            System.out.println("Destination=" + Destination("SR Nagar", "30 mins"));
        } else {
            System.out.println("in correct userName");
        }
        return bookingDetails;

    }
}



