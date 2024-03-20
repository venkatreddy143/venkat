package singletondemo;

public class Test {
    public static void main(String[] args) {
        DBConnection dbConnection=DBConnection.getInstance();
        System.out.println(dbConnection.i);
        dbConnection.i=10;
        System.out.println(dbConnection.i);
        System.out.println(dbConnection.hashCode());
        DBConnection dbConnection1=DBConnection.getInstance();
        System.out.println(dbConnection.i);
        dbConnection1.i=20;
        System.out.println(dbConnection1 .hashCode());
        System.out.println(dbConnection1.i);
    }
}
