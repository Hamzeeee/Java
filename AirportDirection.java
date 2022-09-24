import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Please have patience!");
        while (true) {
            Thread.sleep(4000);
            StartFlight();
        }
    }

    public static void StartFlight() {

        // Airport Direction
        String[] startDirectionFlight = {"MUC", "BER", "HMB", "canceled"};
        String[] endDirectionFlight = {"FRK", "MNH", "KLN", "canceled"};

        // Show Flight direction available
        byte random = (byte) new Random().nextInt(startDirectionFlight.length);
        byte count = (byte) new Random().nextInt(3);
        byte hour = (byte) new Random().nextInt(24);
        byte minutes = (byte) new Random().nextInt(60);

        // Show canceled flight
        if (endDirectionFlight[random] == "canceled") {
            System.out.println("Flight " + startDirectionFlight[count] + " - " + endDirectionFlight[count] + " got canceled. SORRY! :(\n");
            return;
        }

        System.out.println("New flight found: ");
        System.out.println(startDirectionFlight[random] + " - " + endDirectionFlight[random] + " starts at " + hour + ":" + minutes + " GMT+2 \n");

    }


}
