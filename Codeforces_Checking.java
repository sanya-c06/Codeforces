import java.util.Scanner;

public class Codeforces_Checking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        String target = "codeforces";
        
        // Loop through each test case
        while (t-- > 0) {
            // Read the character as a string
            String c = scanner.next();
            
            // Check if "codeforces" contains the string c
            if (target.contains(c)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}