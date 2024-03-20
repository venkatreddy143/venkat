package bookmyshow;

public class TestClass {
    public static void main(String[] args) {
        PaymentProcess p=new PaymentProcess("1122","223",18,1000,1234);
        try{
            p.Process("1122","2233");
            p.PaymentProcess(1000,1234,18);

        }catch (RuntimeException runtimeException){
            System.out.println("Code  "+runtimeException.getCode()+" Message "+runtimeException.getMessage());

        } catch (InvalidCredentials e) {
            System.out.println("Code  :"+e.getCode()+" Message :"+e.getMessage());
        }
    }
}
