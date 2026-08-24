import java.util.Scanner;

public class Buttons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            
            // If c is odd, c % 2 is 1 (Anna gets an extra turn). If even, it's 0.
            if (a + (c % 2) > b) {
                System.out.println("First");
            } else {
                System.out.println("Second");
            }
        }
        
        scanner.close();
    }
}