import java.util.Scanner;

public class Odd_One_Out {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        // Loop through each test case
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            
            // The XOR operator (^) cancels out the duplicates automatically
            System.out.println(a ^ b ^ c);
        }
        
        scanner.close();
    }
}