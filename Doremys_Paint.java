import java.util.Scanner;
import java.util.Arrays;

public class Doremys_Paint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] a = new int[n];
            
            // Read array elements
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            
            // Sort to easily group identical numbers
            Arrays.sort(a);
            
            // If the first and last elements are the same, all elements are identical (1 distinct number)
            if (a[0] == a[n - 1]) {
                System.out.println("Yes");
            } else {
                int count1 = 0;
                int count2 = 0;
                
                // Count how many times the first and last numbers appear
                for (int num : a) {
                    if (num == a[0]) {
                        count1++;
                    } else if (num == a[n - 1]) {
                        count2++;
                    }
                }
                
                // Check if they are the ONLY two numbers (count1 + count2 == n) 
                // AND if their frequencies differ by at most 1
                if (count1 + count2 == n && Math.abs(count1 - count2) <= 1) {
                    System.out.println("Yes");
                } else {
                    System.out.println("No");
                }
            }
        }
        
        scanner.close();
    }
}