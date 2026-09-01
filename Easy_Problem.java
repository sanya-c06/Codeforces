import java.util.Scanner;

public class Easy_Problem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            
            // The number of pairs is always just n - 1
            System.out.println(n - 1);
        }
        
        scanner.close();
    }
}