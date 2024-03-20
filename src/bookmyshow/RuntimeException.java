package bookmyshow;
public class RuntimeException extends java.lang.RuntimeException {
    public String code;

    public String getCode() {
        return code;
    }
    public RuntimeException(String code,String message) {
        super(message);
        this.code = code;
    }
}

