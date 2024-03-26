package threaddemopetrolstation;

public class PetrolStation {

    Object petrol=new Object();
    Object diesel=new Object();
//    public synchronized void petrol(String vehicleNumber,int noOfLiters){
//        for (int i=0;i<=noOfLiters;i++){
//            System.out.println("Vehicle : "+vehicleNumber+"Filled Petrol : "+i);
//        }
//    }
//    public synchronized void diesel(String vehicleNumber,int noOfLiters){
//        for (int i=0;i<=noOfLiters;i++){
//            System.out.println("Vehicle : "+vehicleNumber+"Filled diesel : "+i);
//        }
//    }
    public  void petrolBlock(String vehicleNumber,int noOfLiters){
        synchronized (petrol) {
            for (int i = 0; i <= noOfLiters; i++) {
                System.out.println("Vehicle : " + vehicleNumber + "Filled Petrol : " + i);
            }
        }
    }
    public  void dieselBlock(String vehicleNumber,int noOfLiters){
        synchronized (diesel) {
            for (int i = 0; i <= noOfLiters; i++) {
                System.out.println("Vehicle : " + vehicleNumber + "Filled diesel : " + i);
            }
        }
    }
}
