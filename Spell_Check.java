import java.util.Scanner;
import java.util.Arrays;

public class Spell_Check {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            // Read the length (we must read it to advance the scanner)
            int n = scanner.nextInt();
            // Read the actual string
            String s = scanner.next();
            
            // Convert the string to a character array and sort it
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            
            // Check if the sorted string exactly matches the sorted version of "Timur"
            if (new String(chars).equals("Timru")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        scanner.close();
    }
}