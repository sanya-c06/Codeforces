import java.util.Scanner;

public class Word_Capitalization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        
        // Take the first letter and make it uppercase, then attach the rest of the word
        String result = word.substring(0, 1).toUpperCase() + word.substring(1);
        
        System.out.println(result);
        
        scanner.close();
    }
}