package practice;

public class BookingDetails  extends CarDetails{
    private int otp;
    private String auto;
    private String bike;
    private int noOfPersons;
    private CarDetails carDetails;

    public BookingDetails( int otp, String auto, String bike, int  noOfPersons,
                           CarDetails carDetails) {
        super( carDetails.getCarType(), carDetails.getCharge());
        this.auto = auto;
        this.bike = bike;
        this.noOfPersons = noOfPersons;
        this.carDetails = carDetails;
        this.otp = otp;
    }

    public int getOtp() {
        return otp;
    }

    public String getAuto() {
        return auto;
    }

    public String getBike() {
        return bike;
    }

    public int getNoOfPersons() {
        return noOfPersons;
    }

    public CarDetails getCarDetails() {
        return carDetails;
    }

    @Override
    public String toString() {
        return "BookingDetails{" +
                "otp=" + otp +
                ", auto='" + auto + '\'' +
                ", bike='" + bike + '\'' +
                ", noOfPersons=" + noOfPersons +
                ", carDetails=" + carDetails +
                '}';
    }

    public BookingDetails(int otp, String auto, String bike, int  noOfPersons){
        this(otp,auto,bike,noOfPersons,new CarDetails());
    }




}