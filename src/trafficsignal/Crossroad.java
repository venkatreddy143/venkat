package trafficsignal;

class Crossroad {
    boolean isNorthSouthSignalGreen;
    boolean isEastWestSignalGreen;
    boolean isWestEastSignalGreen;
    boolean isSouthNorthSignalGreen;

    public Crossroad() {
        isNorthSouthSignalGreen = true;
        isEastWestSignalGreen = false;
        isWestEastSignalGreen = false;
        isSouthNorthSignalGreen = false;
    }
    synchronized void allowNorthSouth() {
        while (!isNorthSouthSignalGreen) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Green Signal : Vehicle moving North-South");
        System.out.println("Red Signal : Other Side Vehicles Was Stopped");
    }
    synchronized void allowEastWest() {
        while (!isEastWestSignalGreen) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Green Signal : Vehicle moving East-West");
        System.out.println("Red Signal : Other Side Vehicles Was Stopped");
    }
    synchronized void allowWestEast() {
        while (!isWestEastSignalGreen) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Green Signal : Vehicle moving West-East");
        System.out.println("Red Signal : Other Side Vehicles Was Stopped");
    }
    synchronized void allowSouthNorth() {
        while (!isSouthNorthSignalGreen) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Green Signal : Vehicle moving South-North");
        System.out.println("Red Signal : Other Side Vehicles Was Stopped");
    }
    synchronized void changeSignal() {
        if (isNorthSouthSignalGreen) {
            isNorthSouthSignalGreen = false;
            isEastWestSignalGreen = true;
        } else if (isEastWestSignalGreen) {
            isEastWestSignalGreen = false;
            isWestEastSignalGreen = true;
        } else if (isWestEastSignalGreen) {
            isWestEastSignalGreen = false;
            isSouthNorthSignalGreen = true;
        } else if (isSouthNorthSignalGreen) {
            isSouthNorthSignalGreen = false;
            isNorthSouthSignalGreen = true;
        }
        notifyAll();
    }
}