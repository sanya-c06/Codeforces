import java.util.Scanner;

public class Boring_Apartments {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            // Read the apartment number as a String for easy manipulation
            String x = scanner.next();
            
            // Extract the repeating digit (e.g., '7' from "777" becomes the integer 7)
            int digit = x.charAt(0) - '0';
            
            // Get the length of the string
            int len = x.length();
            
            // Calculate total keystrokes using the math formula
            int total = (digit - 1) * 10 + (len * (len + 1)) / 2;
            
            System.out.println(total);
        }
        
        scanner.close();
    }
}