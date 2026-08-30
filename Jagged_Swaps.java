import java.util.Scanner;

public class Jagged_Swaps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            // Read the size of the permutation
            int n = scanner.nextInt();
            
            // Read the very first element of the array
            int firstElement = scanner.nextInt();
            
            // We must read the rest of the elements to advance the scanner, 
            // even though we don't need to store them.
            for (int i = 1; i < n; i++) {
                scanner.nextInt();
            }
            
            // If the first element is 1, it can be sorted
            if (firstElement == 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}