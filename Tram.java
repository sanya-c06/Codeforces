import java.util.Scanner;

public class Tram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of stops
        int n = scanner.nextInt();
        
        int currentPassengers = 0;
        int maxCapacity = 0;
        
        // Loop through each stop
        for (int i = 0; i < n; i++) {
            int exit = scanner.nextInt();  // Passengers leaving
            int enter = scanner.nextInt(); // Passengers entering
            
            // Update the current number of passengers
            currentPassengers = currentPassengers - exit + enter;
            
            // If the current passenger count is the highest we've seen, update maxCapacity
            if (currentPassengers > maxCapacity) {
                maxCapacity = currentPassengers;
            }
        }
        
        // Output the highest capacity reached
        System.out.println(maxCapacity);
        
        scanner.close();
    }
}