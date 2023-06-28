import java.time.LocalDateTime;

public class RealTimeApp {
    public static void main(String[] args) {
        while (true) {
            LocalDateTime currentTime = LocalDateTime.now();
            System.out.println("Current time: " + currentTime);

            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
