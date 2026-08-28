import java.util.Scanner;

public class Even_Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            
            int wrongEvens = 0;
            int wrongOdds = 0;
            
            // Evaluate each element as it is read
            for (int i = 0; i < n; i++) {
                int a = scanner.nextInt();
                
                // If the parity of the index doesn't match the element
                if (a % 2 != i % 2) {
                    if (i % 2 == 0) {
                        wrongOdds++; // An odd number is at an even index
                    } else {
                        wrongEvens++; // An even number is at an odd index
                    }
                }
            }
            
            // If the mismatched counts are equal, that count is the number of swaps needed
            if (wrongEvens == wrongOdds) {
                System.out.println(wrongEvens);
            } else {
                // Otherwise, it's impossible
                System.out.println(-1);
            }
        }
        
        scanner.close();
    }
}