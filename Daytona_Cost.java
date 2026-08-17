import java.util.Scanner;

public class Daytona_Cost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            
            boolean found = false;
            
            // Read the array elements
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                // If we find k anywhere, set our flag to true
                if (a == k) {
                    found = true;
                }
            }
            
            // Output the result
            if (found) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}