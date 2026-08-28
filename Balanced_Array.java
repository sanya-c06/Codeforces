import java.util.Scanner;

public class Balanced_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int half = n / 2;
            
            // If the half-length is odd, it's impossible to balance
            if (half % 2 != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
                
                // 1. Print the first half (even numbers)
                for (int i = 1; i <= half; i++) {
                    System.out.print((i * 2) + " ");
                }
                
                // 2. Print the second half (odd numbers), except the very last one
                for (int i = 1; i < half; i++) {
                    System.out.print((i * 2 - 1) + " ");
                }
                
                // 3. Print the final odd number that balances the total sum
                System.out.println(n + half - 1);
            }
        }
        
        scanner.close();
    }
}