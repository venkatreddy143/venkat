package methodoverriding;

public class BankAccountService {
    int fromAccountAmount =1000;
    int toAccountAmount =0;
    String fromAccount= null;
    String toAccount=null;
   public boolean login(String username,String password){
        return true;
    }
    public boolean transfer(String fromMobileNo,String toMobileNo,int amount){
        System.out.println("From Super Class BankAccountService");
       if(fromMobileNo.equals("91828")){
           fromAccount="12345";
       }
       if(toMobileNo.equals("93229")){
           toAccount="67890";
       }
        return this.bookTransfer(fromAccount,toAccount,amount);
    }
    private boolean bookTransfer(String fromAccount,String toAccount,int amount){

        fromAccountAmount= fromAccountAmount-amount;
        toAccountAmount=toAccountAmount+amount;
        return true;

    }
}
