import java.util.Scanner;

public class Word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        
        int upperCount = 0;
        int lowerCount = 0;
        
        // Loop through each character to count upper and lower case letters
        for (char c : word.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCount++;
            } else {
                lowerCount++;
            }
        }
        
        // If uppercase characters strictly outnumber lowercase, print in all caps
        if (upperCount > lowerCount) {
            System.out.println(word.toUpperCase());
        } 
        // Otherwise (lowercase is greater or equal), print in all lowercase
        else {
            System.out.println(word.toLowerCase());
        }
        
        scanner.close();
    }
}