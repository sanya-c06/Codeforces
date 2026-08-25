import java.util.Scanner;

public class Short_Substrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            String b = scanner.next();
            
            // Print the very first character
            System.out.print(b.charAt(0));
            
            // Loop through the rest of the string, jumping by 2
            for (int i = 1; i < b.length(); i += 2) {
                System.out.print(b.charAt(i));
            }
            
            // Move to the next line for the next test case
            System.out.println();
        }
        
        scanner.close();
    }
}