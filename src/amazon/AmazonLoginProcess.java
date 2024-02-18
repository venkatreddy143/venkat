package amazon;

public class AmazonLoginProcess {
    public boolean login(AmazonLogin details) {
        String myMail = "reddy@gmail.com";
        String myPassword = "Reddy@123";
        if (myMail ==details.mail && myPassword == details.password) {
            return true;
        } else {
            return false;
        }
    }
}
