package swiggydelivery;

public abstract class SwiggyLogin {
    public String userId;
    public String password;

    public SwiggyLogin(String userId, String password) {
        this.userId = "1234";
        this.password = "1234";
    }
    public String getUserId() {
        return userId;
    }
    public String getPassword() {
        return password;
    }
    public boolean login(String userId, String password) throws CheckedExceptions {
        if(this.userId.equals(userId) && this.password.equals(password)){
            System.out.println("Login successful");
        }else{
            System.out.println("Login Failed Due To Invalid Credentials");
            throw new CheckedExceptions(ErrorCode.exception_401.getErrorCode(), ErrorCode.exception_401.getMessage());
        }return false;
    }
}

