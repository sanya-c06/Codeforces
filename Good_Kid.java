import java.util.Scanner;
import java.util.Arrays;

public class Good_Kid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            
            // Read the digits into the array
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            // Sort the array so the smallest number is always at index 0
            Arrays.sort(a);
            
            // Add 1 to the smallest number
            a[0]++;
            
            // Calculate the product of all elements
            int product = 1;
            for (int num : a) {
                product *= num;
            }
            
            System.out.println(product);
        }
        
        scanner.close();
    }
}