package Amazon;

public class CheckinItem {
    MyBalance myBalance = new MyBalance();
    OrderItems orderItems= new OrderItems();
    AmazonLogin login = new AmazonLogin();

    public String checkinitem(){
        if (myBalance.limit >= orderItems.totalprice){
            myBalance.limit = myBalance.limit - orderItems.totalprice;


            System.out.println(orderItems.totalprice);


            System.out.println(myBalance.limit);
        }
        return "payment success";
    }


        }

