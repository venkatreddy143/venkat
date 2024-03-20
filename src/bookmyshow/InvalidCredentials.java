package bookmyshow;

public class InvalidCredentials extends Exception {
    public String code;

    public String getCode() {
        return code;
    }
    public InvalidCredentials(String code,String message) {
        super(message);
        this.code = code;
    }
}
