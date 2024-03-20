package retryexceptiondemo;

public enum ErrorCodes {
    INSUFFICIENT_FUNDS_ERROR_CODE("1000","Even Number Exception"),
    TIMEOUT_ERROR_CODE("1001","Odd Number Exception");

    private String code;
    private String message;

    ErrorCodes(String code, String message){
         this.code=code;
         this.message=message;
     }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
