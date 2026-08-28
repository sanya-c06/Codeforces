import java.util.Scanner;

public class Maximum_GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            
            // The maximum GCD is always just n divided by 2
            System.out.println(n / 2);
        }
        
        scanner.close();
    }
}