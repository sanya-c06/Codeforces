import java.util.Scanner;

public class Blank_Space {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            
            int maxBlank = 0;
            int currentBlank = 0;
            
            // Process the array elements on the fly
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                
                if (a == 0) {
                    currentBlank++;
                    maxBlank = Math.max(maxBlank, currentBlank);
                } else {
                    currentBlank = 0; // Reset the counter if we hit a 1
                }
            }
            
            // Output the maximum length found for this test case
            System.out.println(maxBlank);
        }
        
        scanner.close();
    }
}