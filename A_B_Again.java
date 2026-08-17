import java.util.Scanner;

public class A_B_Again {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        // Loop through each test case
        while (t-- > 0) {
            int n = scanner.nextInt();
            
            // Print the sum of the tens digit and the ones digit
            System.out.println((n / 10) + (n % 10));
        }
        
        scanner.close();
    }
}