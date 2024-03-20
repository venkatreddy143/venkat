package threaddemo;

public class NumberCountThread extends Thread{

    public void run(){
        System.out.println("From Number Count thread");
        for(int i=0;i<10;i++){
            System.out.println(Thread.currentThread().getName()+i+currentThread().getName());

        }
    }

}
