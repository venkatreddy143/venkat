package Mail;

public class MailTest {
    public static void main(String[] args){

        MailProcess process = new MailProcess();
        MailLogin ml = new MailLogin();
        MessageSent sent = new MessageSent();
       // ml.mail = "reddy@gmail.com";
       // ml.Password="Reddy@123";
        boolean loginStatus = process.login(ml);
        if (loginStatus){
            String inbox = sent.sentMessage("venkat@gmail.com","hi venkat");
            System.out.println(inbox);

        }





        }


    }

