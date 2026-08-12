import java.util.Scanner;

public class Candies_and_Two_Sisters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        // Loop through each test case
        while (t-- > 0) {
            int n = scanner.nextInt();
            
            // Calculate and print the number of ways directly
            System.out.println((n - 1) / 2);
        }
        
        scanner.close();
    }
}