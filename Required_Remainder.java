import java.util.Scanner;

public class Required_Remainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int n = scanner.nextInt();
            
            // Calculate the maximum multiplier 'm'
            int m = (n - y) / x;
            
            // Reconstruct the maximum 'k'
            int k = (m * x) + y;
            
            System.out.println(k);
        }
        
        scanner.close();
    }
}