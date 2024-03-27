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
        System.out.println("Vehicle moving North-South");
    }
    synchronized void allowEastWest() {
        while (!isEastWestSignalGreen) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Vehicle moving East-West");
    }
    synchronized void allowWestEast() {
        while (!isWestEastSignalGreen) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Vehicle moving West-East");
    }
    synchronized void allowSouthNorth() {
        while (!isSouthNorthSignalGreen) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        System.out.println("Vehicle moving South-North");
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