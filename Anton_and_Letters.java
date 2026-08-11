import java.util.Scanner;
import java.util.HashSet;

public class Anton_and_Letters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the entire line of input, including spaces
        String input = scanner.nextLine();
        
        // A HashSet automatically ignores duplicate values
        HashSet<Character> uniqueLetters = new HashSet<>();
        
        // Loop through every character in the string
        for (char c : input.toCharArray()) {
            // If the character is a lowercase letter, add it to the set
            if (c >= 'a' && c <= 'z') {
                uniqueLetters.add(c);
            }
        }
        
        // The size of the set is exactly the number of distinct letters
        System.out.println(uniqueLetters.size());
        
        scanner.close();
    }
}