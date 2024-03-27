package trafficsignal;
public class Test {
    public static void main(String[] args) {
        Crossroad crossroad = new Crossroad();

        Vehicle northVehicle = new Vehicle("North-South", crossroad);
        Vehicle eastVehicle = new Vehicle("East-West", crossroad);
        Vehicle westVehicle = new Vehicle("West-East", crossroad);
        Vehicle southVehicle = new Vehicle("South-North", crossroad);

        northVehicle.start();
        eastVehicle.start();
        westVehicle.start();
        southVehicle.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        crossroad.changeSignal();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        crossroad.changeSignal();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        crossroad.changeSignal();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        crossroad.changeSignal();
    }
}
