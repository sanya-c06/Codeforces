import java.util.Scanner;

public class Borze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the Borze code string
        String s = scanner.next();
        
        // Chain replacements from longest to shortest
        String decoded = s.replace("--", "2")
                          .replace("-.", "1")
                          .replace(".", "0");
        
        // Output the decoded ternary number
        System.out.println(decoded);
        
        scanner.close();
    }
}