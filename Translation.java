import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the two words
        String s = scanner.next();
        String t = scanner.next();
        
        // Use StringBuilder to easily reverse the first word
        String reversedS = new StringBuilder(s).reverse().toString();
        
        // Check if the reversed first word matches the second word
        if (reversedS.equals(t)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}