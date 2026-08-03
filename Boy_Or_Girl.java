import java.util.Scanner;
import java.util.HashSet;

public class Boy_Or_Girl {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.next();
        
        // A HashSet only stores unique elements
        HashSet<Character> uniqueChars = new HashSet<>();
        
        // Convert the string to a character array and add each letter to the set
        for (char c : username.toCharArray()) {
            uniqueChars.add(c);
        }
        
        // Check if the number of unique characters is even or odd
        if (uniqueChars.size() % 2 == 0) {
            System.out.println("CHAT WITH HER!");
        } else {
            System.out.println("IGNORE HIM!");
        }
        
        scanner.close();
    }
}