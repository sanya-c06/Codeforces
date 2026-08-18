import java.util.Scanner;

public class Array_Coloring {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int oddCount = 0;
            
            // Read the array elements and count the odd numbers
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                if (a % 2 != 0) {
                    oddCount++;
                }
            }
            
            // If the count of odd numbers is even, the total sum is even
            if (oddCount % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}