public class MessageSent {
    public String sentMessage(String toMail, String typeMsg) {
        String message ="hi venkat";
        MailProcess mp = new MailProcess();
        MailLogin ml = new MailLogin();
        Boolean loginStatus = mp.login(ml);
        if (loginStatus) {
            message = typeMsg;
            return message;
        }
        return message;

    }

}
