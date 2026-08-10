import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the length of the string
        int n = scanner.nextInt();
        
        // Read the string and immediately convert it to lowercase
        String s = scanner.next().toLowerCase();
        
        // If the string has fewer than 26 characters, it's impossible to be a pangram
        if (n < 26) {
            System.out.println("NO");
            return;
        }
        
        // Loop through every letter of the alphabet from 'a' to 'z'
        for (char c = 'a'; c <= 'z'; c++) {
            // If any letter is not found in the string, it's not a pangram
            if (s.indexOf(c) == -1) {
                System.out.println("NO");
                return; // Stop checking and exit
            }
        }
        
        // If the loop finishes without failing, every letter was found
        System.out.println("YES");
        
        scanner.close();
    }
}