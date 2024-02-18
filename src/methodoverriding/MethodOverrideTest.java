package methodoverriding;

public class MethodOverrideTest {
    public static void main(String[] args) {
        PhonePayService phonePayService=new PhonePayService();
        phonePayService.transfer("91828","93229",100);
        phonePayService.transfer("91828","93229",200);
        phonePayService.transfer("91828","93229",300);
        System.out.println("To Account Amount"+ "---->"+ phonePayService.toAccountAmount);
        System.out.println("to account number :"+phonePayService.toAccount);
        System.out.println(phonePayService.fromAccountAmount);
        BankAccountService bankAccountService=new BankAccountService();
        bankAccountService.transfer("91828","93229",100);
        BankAccountService bankAccountServiceUpCast=new PhonePayService();
        bankAccountServiceUpCast.transfer("91828","93229",100);
        //In Upcast we override superclass methods.(we can access sub class methods).
        //in compile time no-5 and no-14 are different(check type.ref),in run time they are same.
        bankAccountServiceUpCast.login(null,null);

    }
}
