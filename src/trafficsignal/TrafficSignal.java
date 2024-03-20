package trafficsignal;

class TrafficSignal {
    private boolean isGreen = false;
    public synchronized void stop() {
        while (!isGreen) {
            try {
                wait(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Signal is red. STOP!");
    }
    public synchronized void move() {
        isGreen = true;
        System.out.println("Signal is green. MOVE!");
        notify();
    }
    public synchronized void waitForSignalChange() {
        while (isGreen) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public synchronized void signalChange() {
        isGreen = false;
        notify();
    }
}