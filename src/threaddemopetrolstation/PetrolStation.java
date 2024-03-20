package threaddemopetrolstation;

public class PetrolStation {
    public synchronized void petrol(String vehicleNumber,int noOfLiters){
        for (int i=0;i<=noOfLiters;i++){
            System.out.println("Vehicle : "+vehicleNumber+"Filled Petrol : "+i);
        }
    }
    public synchronized void diesel(String vehicleNumber,int noOfLiters){
        for (int i=0;i<=noOfLiters;i++){
            System.out.println("Vehicle : "+vehicleNumber+"Filled diesel : "+i);
        }
    }
}
