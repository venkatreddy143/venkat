public class TestClass {
    public static void main(String[] args) {
        Process p=new Process("1122","2233",18);
        try{
           p.Process("1122","2233");
        }catch (InvalidCredentials i){
            System.out.println("Code  "+i.getCode()+" Message "+i.getMessage());

        }

    }
}
