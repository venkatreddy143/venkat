package amazon;

public class ConfirmTest {
    public static void main(String[] args) {

        AmazonLoginProcess process = new AmazonLoginProcess();
        AmazonLogin al = new AmazonLogin();
        OrderItems Order = new OrderItems();
        CheckinItem check = new CheckinItem();
        MyBalance myBalance = new MyBalance();

        boolean loginStatus = process.login(al);
        if (loginStatus){
            String status = check.checkinitem();
            System.out.println(status);
            


            }

        }
    }

