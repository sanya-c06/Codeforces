import java.util.Scanner;

public class Desorting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            
            int minDiff = Integer.MAX_VALUE;
            int prev = scanner.nextInt();
            
            // Read elements on the fly and track the smallest adjacent difference
            for (int i = 1; i < n; i++) {
                int current = scanner.nextInt();
                int diff = current - prev;
                
                if (diff < minDiff) {
                    minDiff = diff;
                }
                
                prev = current; // Move forward
            }
            
            // If the array is already unsorted, 0 operations are needed
            if (minDiff < 0) {
                System.out.println(0);
            } else {
                // Math formula to calculate how many operations to break the closest pair
                System.out.println((minDiff / 2) + 1);
            }
        }
        
        scanner.close();
    }
}