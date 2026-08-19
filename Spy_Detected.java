import java.util.Scanner;
import java.util.Arrays;

public class Spy_Detected {
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
            
            // Create a sorted copy of the array
            int[] sortedArray = a.clone();
            Arrays.sort(sortedArray);
            
            // The common element will always be at index 1
            int commonElement = sortedArray[1];
            
            // Find the unique element in the original array
            for (int i = 0; i < n; i++) {
                if (a[i] != commonElement) {
                    // Output the 1-based index
                    System.out.println(i + 1);
                    break;
                }
            }
        }
        
        scanner.close();
    }
}