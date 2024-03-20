package trafficsignal;

class TrafficController implements Runnable {
    private TrafficSignal signal;

    public TrafficController(TrafficSignal signal) {
        this.signal = signal;
    }

    @Override
    public void run() {
        while (true) {
            signal.move(); 
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            signal.signalChange(); // Signal changes
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}