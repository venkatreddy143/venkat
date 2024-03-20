package threaddemopetrolstation;

public class Vehicle extends Thread {

    int liters;
    String status;
    String type;
    PetrolStation petrolStation;

    public Vehicle(int liters, String status, String type, PetrolStation petrolStation) {
        this.liters = liters;
        this.status = status;
        this.type = type;
        this.petrolStation = petrolStation;
    }
    public void run(){
        if (type.equals("petrol")){
            System.out.println(Thread.currentThread().getName());
            petrolStation.petrol(Thread.currentThread().getName(), this.liters);
        }else{
            System.out.println(Thread.currentThread().getName());
            petrolStation.diesel(Thread.currentThread().getName(), this.liters);
        }
    }
}
