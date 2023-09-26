public class FiveMinuteLoop {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        long endTime = startTime + (5 * 60 * 1000); // 5 minutes in milliseconds

        while (System.currentTimeMillis() < endTime) {
            // Your code to be executed repeatedly goes here
            System.out.println("Looping...");
            
            try {
                Thread.sleep(1000); // Sleep for 1 second (1000 milliseconds)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Loop finished after 5 minutes.");
    }
}
