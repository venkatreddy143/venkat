package threaddemopetrolstation;

public class SynchronizedDemoTest {
    public static void main(String[] args) {
        PetrolStation petrolStation=new PetrolStation();

        Thread Pulsar=new Vehicle(2,"empty","petrol",petrolStation);
        Pulsar.setName("Pulsar");
        Thread Duke=new Vehicle(2,"empty","petrol",petrolStation);
        Duke.setName("Duke");
        Thread RE=new Vehicle(2,"empty","petrol",petrolStation);
        RE.setName("RE");

        Thread lorry=new Vehicle(2,"empty","diesel",petrolStation);
        lorry.setName("lorry");
        Thread bus=new Vehicle(2,"empty","diesel",petrolStation);
        bus.setName("bus");

        Pulsar.start();
        Duke.start();
        RE.start();
        lorry.start();
        bus.start();
    }
}
