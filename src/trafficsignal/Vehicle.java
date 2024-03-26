package trafficsignal;

class Vehicle extends Thread {
    String direction;
    Crossroad crossroad;

    public Vehicle(String direction, Crossroad crossroad) {
        this.direction = direction;
        this.crossroad = crossroad;
    }

    public void run() {
        if (direction.equals("North-South")) {
            crossroad.allowNorthSouth();
        } else if (direction.equals("East-West")) {
            crossroad.allowEastWest();
        } else if (direction.equals("West-East")) {
            crossroad.allowWestEast();
        } else if (direction.equals("South-North")) {
            crossroad.allowSouthNorth();
        }
    }
}