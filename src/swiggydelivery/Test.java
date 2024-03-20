package swiggydelivery;

public class Test {
    public static void main(String[] args) {
        Payment payment=new Payment("1234","1234",1,"Biryani",
                "Starters",2,1000);
        try {
            payment.login("1234","1234");
            payment.order();
            payment.couponsProcess();
            payment.swiggypayment();
        } catch (CheckedExceptions e) {
            System.out.println(e);
        }
    }
}
