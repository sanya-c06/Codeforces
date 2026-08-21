import java.util.Scanner;

public class Minimize {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        // Loop through each test case
        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            // The result is always just the difference between b and a
            System.out.println(b - a);
        }
        
        scanner.close();
    }
}