import java.util.Scanner;

public class YES_or_YES {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        // Loop through each test case
        for (int i = 0; i < t; i++) {
            String s = scanner.next();
            
            // equalsIgnoreCase checks for equality while ignoring uppercase/lowercase differences
            if (s.equalsIgnoreCase("YES")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}