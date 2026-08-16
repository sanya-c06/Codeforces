import java.util.Scanner;

public class Halloumi_Boxes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            
            boolean isSorted = true;
            int[] a = new int[n];
            
            // Read the array and simultaneously check if it is already sorted
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
                if (i > 0 && a[i] < a[i - 1]) {
                    isSorted = false;
                }
            }
            
            // If k >= 2, we can always sort it. If k == 1, it must already be sorted.
            if (k >= 2 || isSorted) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}