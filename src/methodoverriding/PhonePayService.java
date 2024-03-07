package methodoverriding;

public class PhonePayService extends BankAccountService {
    public boolean transfer(String fromMobileNo,String toMobileNo,int amount){
        System.out.println("From Child Class BankAccountService");
         return super.transfer(fromMobileNo,toMobileNo,amount);
    }
}
