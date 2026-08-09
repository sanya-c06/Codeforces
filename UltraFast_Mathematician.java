import java.util.Scanner;

public class UltraFast_Mathematician {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the two numbers as Strings
        String s1 = scanner.next();
        String s2 = scanner.next();
        
        StringBuilder result = new StringBuilder();
        
        // Loop through each character index
        for (int i = 0; i < s1.length(); i++) {
            // If the characters at the current position match, append '0'
            if (s1.charAt(i) == s2.charAt(i)) {
                result.append('0');
            } 
            // If they are different, append '1'
            else {
                result.append('1');
            }
        }
        
        // Print the final calculated string
        System.out.println(result);
        
        scanner.close();
    }
}