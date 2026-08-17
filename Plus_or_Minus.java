import java.util.Scanner;

public class Plus_or_Minus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        // Loop through each test case
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            
            // Check if addition works
            if (a + b == c) {
                System.out.println("+");
            } else {
                // If it's not addition, the problem guarantees it must be subtraction
                System.out.println("-");
            }
        }
        
        scanner.close();
    }
}