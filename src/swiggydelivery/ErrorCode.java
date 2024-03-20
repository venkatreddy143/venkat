package swiggydelivery;

public enum ErrorCode {
    exception_401("Invalid Credentials","exception_401"),
    exception_402("Order was Canceled","exception_402"),
    exception_403("Payment Unsuccessful","exception_403");

    String message;
    String errorCode;

    ErrorCode(String message, String errorCode) {
        this.message=message;
        this.errorCode=errorCode;
    }
    public String getMessage() {
        return message;
    }
    public String getErrorCode() {
        return errorCode;
    }
}
