package singletondemo;

public class DBConnection {

    private static final DBConnection dbconnection=new DBConnection();

    public int i =0;

    private DBConnection(){
        System.out.println("From private constructor");
    }
    public static DBConnection getInstance(){
        return dbconnection;
    }
}
