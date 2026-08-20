import java.util.Scanner;

public class Another_Two_Integers_Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            // Find the absolute difference between the two numbers
            int diff = Math.abs(a - b);
            
            // (diff + 9) / 10 mathematically simulates rounding up
            System.out.println((diff + 9) / 10);
        }
        
        scanner.close();
    }
}