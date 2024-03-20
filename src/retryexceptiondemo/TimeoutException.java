package retryexceptiondemo;

public class TimeoutException extends RuntimeException {
    private String errorCode;
    private String errorMsg;

    public TimeoutException(String code, String message){
        super(message);
        this.errorCode=code;
        this.errorMsg=message;
    }
}
