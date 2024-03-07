package intrest;

public class FinalPayment {
    public static void main(String[] args){
        AmountGive ag1= new AmountGive(100000,36,0.02);
        AmountGive ag2= new AmountGive(200000,48,0.02);
        AmountGive ag3= new AmountGive(300000,24,0.02);

        double ag1price = ag1.amount + (ag1.months *  ag1.rateOfintrest * ag1.amount);
        double ag2price = ag2.amount + (ag2.months *  ag2.rateOfintrest * ag2.amount);
        double ag3price = ag3.amount + (ag3.months *  ag3.rateOfintrest * ag3.amount);
        double totalprice = ag1price + ag2price + ag3price;

        System.out.println(ag1price);
        System.out.println(ag2price);
        System.out.println(ag3price);


        System.out.println(totalprice);
    }
}
