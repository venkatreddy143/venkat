package trafficsignal;
public class Test {
    public static void main(String[] args) {
        TrafficSignal signal = new TrafficSignal();
        TrafficController controller = new TrafficController(signal);
        Thread controllerThread = new Thread(controller);
        controllerThread.start();

        for (int i = 0; i < 5; i++) {
            Thread carThread = new Thread(() -> {
                while (true) {
                    signal.stop();
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    signal.waitForSignalChange();
                }
            });
            carThread.start();
        }
    }
}