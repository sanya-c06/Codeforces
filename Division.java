import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        // Loop through each test case
        while (t-- > 0) {
            int rating = scanner.nextInt();
            
            // Check thresholds from highest to lowest
            if (rating >= 1900) {
                System.out.println("Division 1");
            } else if (rating >= 1600) {
                System.out.println("Division 2");
            } else if (rating >= 1400) {
                System.out.println("Division 3");
            } else {
                System.out.println("Division 4");
            }
        }
        
        scanner.close();
    }
}