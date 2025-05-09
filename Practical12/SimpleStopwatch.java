import java.util.Scanner;

public class SimpleStopwatch {
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        stopwatch.start();  // Start the stopwatch (thread)

        System.out.println("Stopwatch started. Press Enter to stop...");
        new Scanner(System.in).nextLine();  // Wait for Enter key

        stopwatch.stopRunning();  // Stop the thread
        System.out.println("Stopwatch stopped.");
    }
}

class Stopwatch extends Thread {
    private boolean running = true;
    private int seconds = 0;

    public void run() {
        while (running) {
            try {
                Thread.sleep(1000);  // Sleep for 1 second
                seconds++;
                System.out.println("Elapsed time: " + seconds + " second(s)");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void stopRunning() {
        running = false;
    }
}
