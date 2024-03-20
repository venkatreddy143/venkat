package swiggydelivery;

public class CheckedExceptions extends Exception {
    public String code;

    public String getCode() {
        return code;
    }
    public CheckedExceptions(String code,String message) {
        super(message);
        this.code = code;
    }
}
