import java.util.Random;

public class AirportInformation {


    public static void main(String[] args) throws InterruptedException {
        AirportInformation airportInformation = new AirportInformation();
        System.out.println("Please have patience!");
        while (true) {
            Thread.sleep(4000);
            airportInformation.startFlight();
        }
    }

    public void startFlight() {

        // Airport Direction
        String[] startDirectionFlight = {"MUC", "BER", "HMB", "cancelled"};
        String[] endDirectionFlight = {"FRK", "MNH", "KLN", "cancelled"};

        // Show Flight direction available
        byte random = (byte) new Random().nextInt(startDirectionFlight.length);
        byte count = (byte) new Random().nextInt(3);
        byte hour = (byte) new Random().nextInt(24);
        byte minutes = (byte) new Random().nextInt(60);

        // Show canceled flight
        if (endDirectionFlight[random].equalsIgnoreCase("cancelled")) {
            System.out.println("Flight " + startDirectionFlight[count] + " - " + endDirectionFlight[count] + " got cancelled. SORRY! :(\n");
            return;
        }

        System.out.println("New flight found: ");
        System.out.println(startDirectionFlight[random] + " - " + endDirectionFlight[random] + " starts at " + hour + ":" + minutes + " GMT+2 \n");

    }


}
