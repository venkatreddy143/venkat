package mail;

public class MailProcess {
    public boolean login(MailLogin details){
        String myMail = "reddy@gmail.com";
        String myPassword = "Reddy@123";
        if (myMail == details.mail  && myPassword == details.Password ) {
            return true;
        }else {
            return false;
        }





        }



    }

