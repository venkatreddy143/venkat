package retryexceptiondemo;

public class InsufficientFundsException extends RuntimeException{
   private String errorCode;
   private String errorMsg;

   public InsufficientFundsException(String code, String message){
       this.errorCode=code;
       this.errorMsg=message;
   }
}
