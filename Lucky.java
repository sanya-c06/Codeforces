import java.util.Scanner;

public class Lucky {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        // Loop through each test case
        while (t-- > 0) {
            String s = scanner.next();
            
            // Compare the sum of the first 3 characters' ASCII values to the last 3
            if (s.charAt(0) + s.charAt(1) + s.charAt(2) == s.charAt(3) + s.charAt(4) + s.charAt(5)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}