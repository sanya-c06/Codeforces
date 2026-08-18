import java.util.Scanner;

public class Line_Trip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            
            int maxDistance = 0;
            int previousStation = 0;
            
            // Calculate distances between consecutive stations as they are read
            for (int i = 0; i < n; i++) {
                int currentStation = scanner.nextInt();
                maxDistance = Math.max(maxDistance, currentStation - previousStation);
                previousStation = currentStation;
            }
            
            // Calculate the turnaround distance at the end
            int turnaroundDistance = 2 * (x - previousStation);
            maxDistance = Math.max(maxDistance, turnaroundDistance);
            
            // Output the minimum required tank volume
            System.out.println(maxDistance);
        }
        
        scanner.close();
    }
}