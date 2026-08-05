import java.util.Scanner;

public class Wrong_Subtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        // Repeat the operation k times
        for (int i = 0; i < k; i++) {
            // Check if the last digit is 0 using the modulo operator
            if (n % 10 == 0) {
                n = n / 10; // Remove the last digit
            } else {
                n = n - 1;  // Decrease the number by 1
            }
        }
        
        // Print the final result
        System.out.println(n);
        
        scanner.close();
    }
}