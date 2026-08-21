import java.util.Scanner;

public class Dislike_of_Threes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int k = scanner.nextInt();
            
            // Start checking numbers from 1 upwards endlessly
            for (int num = 1; ; num++) {
                // Skip the numbers Polycarp dislikes
                if (num % 3 == 0 || num % 10 == 3) {
                    continue;
                }
                
                // If it's a valid number, countdown our target k
                k--;
                
                // When k reaches 0, we've found our answer
                if (k == 0) {
                    System.out.println(num);
                    break;
                }
            }
        }
        
        scanner.close();
    }
}