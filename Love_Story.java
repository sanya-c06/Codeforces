import java.util.Scanner;

public class Love_Story {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Read the number of test cases
        int t = scanner.nextInt();
        String target = "codeforces";
        
        while (t-- > 0) {
            String s = scanner.next();
            int diffCount = 0;
            
            // Compare the strings character by character
            for (int i = 0; i < 10; i++) {
                if (s.charAt(i) != target.charAt(i)) {
                    diffCount++;
                }
            }
            
            // Output the total number of differences
            System.out.println(diffCount);
        }
        
        scanner.close();
    }
}