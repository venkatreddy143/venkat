
public enum CheckedException {
    exception_401("Invalid Credentials","exception_401"),
    exception_402("Invalid OTP","exception_402");
    String message;
    String errorCode;

    public String getMessage() {
        return message;
    }
    public String getErrorCode() {
        return errorCode;
    }
    CheckedException(String message, String errorCode) {
        this.message=message;
        this.errorCode=errorCode;
    }
}
