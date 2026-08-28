import java.util.Scanner;

public class Dont_Try_to_Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            String x = scanner.next();
            String s = scanner.next();
            
            int operations = -1; // Default to -1 (impossible)
            
            // Loop a maximum of 6 times because the strings are very small
            for (int i = 0; i <= 6; i++) {
                // Check if s is already a substring of x
                if (x.contains(s)) {
                    operations = i;
                    break; // Found the answer, exit the loop
                }
                // If not, perform the operation: double the string x
                x += x;
            }
            
            // Output the result
            System.out.println(operations);
        }
        
        scanner.close();
    }
}