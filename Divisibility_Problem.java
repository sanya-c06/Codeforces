import java.util.Scanner;

public class Divisibility_Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        // Loop through each test case
        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            int remainder = a % b;
            
            // If the remainder is 0, 'a' is already divisible by 'b'
            if (remainder == 0) {
                System.out.println(0);
            } 
            // Otherwise, we need to add the difference between 'b' and the remainder
            else {
                System.out.println(b - remainder);
            }
        }
        
        scanner.close();
    }
}