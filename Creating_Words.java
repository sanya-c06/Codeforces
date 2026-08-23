import java.util.Scanner;

public class Creating_Words {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            // Read the two strings
            String a = scanner.next();
            String b = scanner.next();
            
            // Swap the first characters and combine with the rest of the strings
            String newA = b.charAt(0) + a.substring(1);
            String newB = a.charAt(0) + b.substring(1);
            
            // Output the new strings separated by a space
            System.out.println(newA + " " + newB);
        }
        
        scanner.close();
    }
}