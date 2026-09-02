import java.util.Scanner;

public class A_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            // Read the expression as a string (e.g., "4+2")
            String s = scanner.next();
            
            // Extract characters and convert them to integers using ASCII math
            int a = s.charAt(0) - '0';
            int b = s.charAt(2) - '0';
            
            // Output the sum
            System.out.println(a + b);
        }
        
        scanner.close();
    }
}