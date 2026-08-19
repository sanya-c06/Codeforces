import java.util.Scanner;
import java.util.Arrays;

public class Remove_Smallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            
            // Read the array elements
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            // Sort the array in ascending order
            Arrays.sort(a);
            
            boolean possible = true;
            
            // Check the difference between adjacent elements
            for (int i = 1; i < n; i++) {
                if (a[i] - a[i - 1] > 1) {
                    possible = false;
                    break; // No need to check further if we find a gap
                }
            }
            
            // Output the result
            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}